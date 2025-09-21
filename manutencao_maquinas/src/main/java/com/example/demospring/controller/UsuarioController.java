package com.example.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import com.example.demospring.model.Usuario;
//import org.springframework.stereotype.Service;
import com.example.demospring.repository.UsuarioRepository;

//import ch.qos.logback.core.model.Model;

@Controller
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    //@Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/usuarios/list")
    public String listUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "usuarios/list";
    }

    // Exibe o formulário de criação
    @GetMapping("/usuarios/new")
    //@ResponseBody
    public String showAddUsuarioForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios/add-form"; 
    }

    // Processa os dados do formulário e salva
    @PostMapping("/usuarios/store")
    public String addUsuario(@ModelAttribute Usuario usuario) {
        // O @ModelAttribute vincula os dados do formulário a um novo objeto Usuario
        // O controller usa o repository para salvar o objeto
        usuarioRepository.save(usuario);
        
        // Redireciona para a página de listagem de produtos
        return "redirect:/usuarios/list";
    }

    // Gera formulário com os dados do usuário para edição
    @GetMapping("usuarios/edit/{id}")
    public String showEditForm(@PathVariable("id") long id, Model model) {
        // Busca objeto usuário no BD
        Usuario u = usuarioRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Id inválido:" + id));

        model.addAttribute("usuario", u);
        return "usuarios/edit-form";
    }

    // Atualiza objeto usuário no BD
    @PostMapping("usuarios/update/{id}")
    public String updateUsuario(@PathVariable("id") long id,
                                @ModelAttribute("usuario") Usuario usuario,
                                BindingResult result,
                                Model model) {

        usuario.setId(id);

        // Atualiza usuário no banco de dados
        usuarioRepository.save(usuario);

        // volta para a lista de usuários
        return "redirect:/usuarios/list";
    }
}