package com.zia.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.zia.model.Pessoa;
import com.zia.repository.PessoaRepository;

@Repository
public class UserDetailsServiceImplementacao implements UserDetailsService{

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException{
		Pessoa pessoa = pessoaRepository.findByLogin(login);
	
		if (pessoa == null){
			throw new UsernameNotFoundException("Usuário não encontrado");
		}
		
		return pessoa;
	}
}

