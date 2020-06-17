package com.zia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zia.model.Concluidos;
import com.zia.service.ConcluidosService;

@Controller
public class PaginaInicialController {
	
	@Autowired
	ConcluidosService cs;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("redirect:/inicio");
		return mv;
	}
	
	@RequestMapping("/inicio")
	public ModelAndView inicio() {
		Concluidos d = cs.getC();
		ModelAndView mv = new ModelAndView("painel");
		String finalD = "nem";
		String l = "";
		String s = ""; 
		if (d.getD1() == 1 && d.getD2() == 1 && d.getD3() ==1 && d.getD4()==1 && d.getD5()==1) {
			finalD = "final";
			l = "Login = biscoitao";
			s = "Senha = cafezinho";
		}
		
		mv.addObject("final", finalD);
		mv.addObject("l", l);
		mv.addObject("s", s);
		mv.addObject("desafios", d);
		
		return mv;
	}
	
	@RequestMapping("/zerador")
	public ModelAndView zerado() {
		Concluidos z = cs.getC();
		z.setD1(0);
		z.setD2(0);
		z.setD3(0);
		z.setD4(0);
		z.setD5(0);
		
		cs.add(z);
		ModelAndView mv = new ModelAndView("redirect:/inicio");
		return mv;
	}
}
