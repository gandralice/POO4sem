package com.example.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospring.model.Maquina;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina, Long> {    
}
