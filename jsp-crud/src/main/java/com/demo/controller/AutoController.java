package com.demo.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Auto;
import com.demo.service.AutoService;

@Controller
public class AutoController {

	@Autowired
	@Qualifier("autoServiceImpl") // se puede omitir cuando solo existe 1 child
	private AutoService autoService;
	
	@GetMapping(value = "")
	public String findALL_GET(Map<String, Object> map) {
		map.put("listaCarros", autoService.findAll());
		return "findALL_car";
	}
	
	@GetMapping(value = "/insertarAuto")
	public String insertar(Map<String, Object> map) {
		Auto auto = new Auto();
		map.put("auto", auto);
		return "insertar_car";
	}
	
	@PostMapping(value = "/insertarAuto")
	public String insertarSave(Auto auto) {
		autoService.insertar(auto);
		return "redirect:/listarAutos";
	}
	
	@PostMapping(value = "/editarAuto/{id_auto}")
	public String editarAuto(@PathVariable Integer id_auto, Map<String, Object> map) {
		Auto auto = autoService.findById(id_auto);
		map.put("auto", auto);
		return "editar_car";
	}
}
