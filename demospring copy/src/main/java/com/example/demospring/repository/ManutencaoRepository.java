package com.example.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demospring.model.Manutencao;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {

    @GetMapping("/maquinas/manutencao/new/{id}")
    default String showAddManutencaoForm(long id, Model model) {
        model.addAttribute("manutencao", new Manutencao());
        model.addAttribute("maquina_id", id);
        return "maquinas/add-manutencao";
    }    
}
