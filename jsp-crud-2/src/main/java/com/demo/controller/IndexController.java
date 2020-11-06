package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.User;
import com.demo.service.iUserService;

@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	private iUserService userService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index"); // nombre del jsp
		model.addObject("list", userService.listAllUsers());
		return model;	
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
	public ModelAndView deleteUsers(@PathVariable long id) {
		userService.deleteUser(id);
		return new ModelAndView("redirect:/index");
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView userAdd(@ModelAttribute("user") User user) {
		ModelAndView model = new ModelAndView("index");
		if(user!=null) {
			userService.saveUser(user);
			model.addObject("warning", "registro exitoso");
		} else {
			model.addObject("danger", "registro no exitoso");
		}
		return new ModelAndView("redirect:/index");
	}
	
	@RequestMapping(value = "/{id}/form", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable("id") long id) {
		ModelAndView model = new ModelAndView("form");
		User user = userService.getUserById(id);
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam("id") long id,
			@RequestParam("nombre") String nombre,
			@RequestParam("apodo") String apodo,
			@RequestParam("faccion") String faccion) {
		User user = userService.getUserById(id);
		user.setNombre(nombre);
		user.setFaccion(faccion);
		user.setFaccion(faccion);
		userService.saveUser(user);
		return new ModelAndView("redirect:/index");
	}
}
