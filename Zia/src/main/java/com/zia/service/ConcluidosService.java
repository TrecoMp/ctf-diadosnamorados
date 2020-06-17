package com.zia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zia.model.Concluidos;
import com.zia.repository.ConcluidosRepository;

@Service
public class ConcluidosService {
	
	@Autowired
	ConcluidosRepository cr;

	public void add(Concluidos c) {
		cr.save(c);
	}
	
	public Concluidos getC() {
		return cr.getOne((long) 1010);
	}

}
