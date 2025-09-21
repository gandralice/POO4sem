package com.example.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demospring.model.Compressor;
import com.example.demospring.model.Furadeira;
import com.example.demospring.model.Empilhadeira;
import com.example.demospring.repository.MaquinaRepository;

@Controller
@RequestMapping("/maquinas")
public class MaquinaController {

    private final MaquinaRepository maquinaRepository;

    public MaquinaController(MaquinaRepository maquinaRepository) {
        this.maquinaRepository = maquinaRepository;
    }

    @GetMapping("/list")
    public String getMaquinaList(Model model) {
        model.addAttribute("maquinas", maquinaRepository.findAll());
        return "maquinas/list";
    }

    @GetMapping("/compressor/new")
    public String showAddCompressorForm(Model model) {
        model.addAttribute("compressor", new Compressor());
        return "maquinas/add-compressor";
    }

    @PostMapping("/compressor/store")
    public String addCompressor(@ModelAttribute Compressor compressor) {
        maquinaRepository.save(compressor);
        return "redirect:/maquinas/list";
    }
   
    @GetMapping("/furadeira/new")
    public String showAddFuradeiraForm(Model model) {
        model.addAttribute("furadeira", new Furadeira());
        return "maquinas/add-furadeira";
    }

    @PostMapping("/furadeira/store")
    public String addFuradeira(@ModelAttribute Furadeira furadeira) {
        maquinaRepository.save(furadeira);
        return "redirect:/maquinas/list";
    }

    @GetMapping("/empilhadeira/new")
    public String showAddEmpilhadeiraForm(Model model) {
        model.addAttribute("empilhadeira", new Empilhadeira());
        return "maquinas/add-empilhadeira";
    }
    @PostMapping("/empilhadeira/store")
    public String addEmpilhadeira(@ModelAttribute Empilhadeira empilhadeira) {
        maquinaRepository.save(empilhadeira);
        return "redirect:/maquinas/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteMaquina(@PathVariable("id") Long id) {
        maquinaRepository.deleteById(id);
        return "redirect:/maquinas/list";
    }

}