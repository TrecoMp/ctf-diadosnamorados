package com.zia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zia.model.Concluidos;

@Repository
public interface ConcluidosRepository extends JpaRepository<Concluidos, Long>{

}
