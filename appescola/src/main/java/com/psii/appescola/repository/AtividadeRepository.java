package com.psii.appescola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psii.appescola.model.Atividade;

public interface AtividadeRepository extends JpaRepository <Atividade, Long>{
    
}
