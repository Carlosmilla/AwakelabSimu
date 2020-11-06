package com.simAw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.simAw.entity.Ayudas;
import com.simAw.entity.Beneficiarios;
import com.simAw.entity.Ciudades;
import com.simAw.services.AyudasService;
import com.simAw.services.BeneficiariosService;
import com.simAw.services.CiudadesService;


@Controller
public class MainController {

	@Autowired 
	private AyudasService ayuService;
	
	@Autowired
	private BeneficiariosService benService;
	
	@Autowired
	private CiudadesService ciuService;
	
	@GetMapping("/listar")
	public String listarRegistroAccidente(Model model) {
	    List<Ayudas> ayuda = ayuService.listAyudas();
	    model.addAttribute("ayu", ayuda);
	    	return "base";
	} 
}
