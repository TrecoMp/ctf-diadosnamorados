package com.zia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zia.model.Pessoa;
import com.zia.model.Role;
import com.zia.service.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping("/logar")
	public ModelAndView logar() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	/*
	@RequestMapping("/formulario")
	public ModelAndView formPessoa() {
		ModelAndView mv = new ModelAndView("formulario-pessoa");
		return mv;
	}
	
	@RequestMapping("/adicionar")
	public ModelAndView adicionar(Pessoa pessoa) {
			Role role = new Role();
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			List<Role> roles = new ArrayList<Role>();
			role.setPapel("ROLE_USER");
			pessoas.add(pessoa);
			roles.add(role);
			role.setPessoas(pessoas);
			//fim
			pessoa.setRoles(roles);
			pessoaService.adicionarPessoa(pessoa);
			ModelAndView mv = new ModelAndView("redirect:/pessoa/painel");
			return mv;	
	}
	*/
}
