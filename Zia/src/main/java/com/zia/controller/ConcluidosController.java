package com.zia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zia.model.Concluidos;
import com.zia.model.Response;
import com.zia.service.ConcluidosService;

@Controller
@RequestMapping("/desafios")
public class ConcluidosController {
	
	@Autowired
	ConcluidosService cs;
	
	@RequestMapping("/d1")
	public ModelAndView desafio01(){
		ModelAndView mv = new ModelAndView("desafio01");
		String resposta = "init";
		mv.addObject("resposta", resposta);
		return mv;
	}
	
	@RequestMapping("/td1")
	public ModelAndView testaD1(String request) {
		Concluidos c = cs.getC();
		ModelAndView mv = null;
		if (request.equals("carro")) {
			c.setD1(1);
			cs.add(c);
			mv = new ModelAndView("redirect:/inicio");
		}else {
			mv = new ModelAndView("desafio01");
			mv.addObject("resposta", "errou");
		}
		return mv;
	}
	
	
	@RequestMapping("/d2")
	public ModelAndView desafio02(){
		ModelAndView mv = new ModelAndView("desafio02");
		String resposta = "init";
		mv.addObject("resposta", resposta);
		return mv;
	}
	
	@RequestMapping("/td2")
	public ModelAndView testaD2(String request) {
		Concluidos c = cs.getC();
		ModelAndView mv = null;
		if (request.equals("detodasasloucasdomundo")) {
			c.setD2(1);
			cs.add(c);
			mv = new ModelAndView("redirect:/inicio");
		}else {
			mv = new ModelAndView("desafio02");
			mv.addObject("resposta", "errou");
		}
		return mv;
	}
	
	@RequestMapping("/d3")
	public ModelAndView desafio03(){
		ModelAndView mv = new ModelAndView("desafio03");
		String resposta = "init";
		mv.addObject("resposta", resposta);
		return mv;
	}
	
	@RequestMapping("/td3")
	public ModelAndView testaD3(String request) {
		Concluidos c = cs.getC();
		ModelAndView mv = null;
		if (request.equals("eu_quis_voce")) {
			c.setD3(1);
			cs.add(c);
			mv = new ModelAndView("redirect:/inicio");
		}else {
			mv = new ModelAndView("desafio03");
			mv.addObject("resposta", "errou");
		}
		return mv;
	}
	
	@RequestMapping("/d4")
	public ModelAndView desafio04(){
		ModelAndView mv = new ModelAndView("desafio04");
		String resposta = "init";
		mv.addObject("resposta", resposta);
		return mv;
	}
	
	@RequestMapping("/td4")
	public ModelAndView testaD4(String request) {
		Concluidos c = cs.getC();
		ModelAndView mv = null;
		if (request.equals("batman")) {
			c.setD4(1);
			cs.add(c);
			mv = new ModelAndView("redirect:/inicio");
		}else {
			mv = new ModelAndView("desafio04");
			mv.addObject("resposta", "errou");
		}
		return mv;
	}
	
	
	@RequestMapping("/d5")
	public ModelAndView desafio05(){
		ModelAndView mv = new ModelAndView("desafio05");
		String resposta = "init";
		mv.addObject("resposta", resposta);
		return mv;
	}
	
	@RequestMapping("/td5")
	public ModelAndView testaD5(String request) {
		Concluidos c = cs.getC();
		ModelAndView mv = null;
		if (request.equals("1272")) {
			c.setD5(1);
			cs.add(c);
			mv = new ModelAndView("redirect:/inicio");
		}else {
			mv = new ModelAndView("desafio05");
			mv.addObject("resposta", "errou");
		}
		return mv;
	}
	
	
	@RequestMapping("/galeria")
	public ModelAndView galeria(){
		ModelAndView mv = new ModelAndView("galeria");
		return mv;
	}
	
	@RequestMapping("/galeria/response")
	public ResponseEntity<Response> galeriaResp(){
		Response r = new Response("q","u","a","l","o","h","e","r",
				"o","i","f","a","v","o","r","i","t","o","d","o","s","e","u","n","a","m",
				"o","r","a","d","o");
		return new ResponseEntity<Response>(r, HttpStatus.OK);
	}
}
