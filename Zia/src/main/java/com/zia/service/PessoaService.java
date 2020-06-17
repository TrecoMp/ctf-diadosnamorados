package com.zia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.zia.model.Pessoa;
import com.zia.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void adicionarPessoa(Pessoa pessoa) {
		pessoa.setSenha(new BCryptPasswordEncoder().encode(pessoa.getSenha()));
		pessoaRepository.save(pessoa);
	}
	
	public Pessoa buscarPorLogin(String login) {
		return pessoaRepository.findByLogin(login);
	}
}
