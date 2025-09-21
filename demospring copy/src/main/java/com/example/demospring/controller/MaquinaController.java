package com.example.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demospring.model.Compressor;
import com.example.demospring.model.Empilhadeira;
import com.example.demospring.model.Furadeira;
import com.example.demospring.model.Manutencao;
import com.example.demospring.repository.MaquinaRepository;
import com.example.demospring.repository.ManutencaoRepository;
import com.example.demospring.model.Funcionario;
import com.example.demospring.repository.FuncionarioRepository;


@Controller
public class MaquinaController {

    private final MaquinaRepository maquinaRepository;
    private final ManutencaoRepository manutencaoRepository;
    private final FuncionarioRepository funcionarioRepository;

    public MaquinaController(MaquinaRepository maquinaRepository,
                         ManutencaoRepository manutencaoRepository,
                         FuncionarioRepository funcionarioRepository) {
    this.maquinaRepository = maquinaRepository;
    this.manutencaoRepository = manutencaoRepository;
    this.funcionarioRepository = funcionarioRepository;
}


    // Rotas para Compressor (já existentes)
    @GetMapping("/maquinas/compressor/new")
    public String showAddCompressorForm(Model model) {
        model.addAttribute("compressor", new Compressor());
        return "maquinas/add-compressor";
    }

    @PostMapping("/maquinas/compressor/store")
    public String addCompressor(@ModelAttribute Compressor compressor) {
        maquinaRepository.save(compressor);
        return "redirect:/maquinas/list";
    }

    // Rotas novas para Furadeira
    @GetMapping("/maquinas/furadeira/new")
    public String showAddFuradeiraForm(Model model) {
        model.addAttribute("furadeira", new Furadeira());
        return "maquinas/add-furadeira";  // nome do template que criamos
    }

    @PostMapping("/maquinas/furadeira/store")
    public String addFuradeira(@ModelAttribute Furadeira furadeira) {
        maquinaRepository.save(furadeira);
        return "redirect:/maquinas/list";
    }

    // Rota para listar máquinas (já existente)
    @GetMapping("/maquinas/list")
    public String getMaquinaList(Model model) {
        model.addAttribute("maquinas", maquinaRepository.findAll());
        return "maquinas/list";
    }

    @GetMapping("/maquinas/empilhadeira/new")
    public String showAddEmpilhadeiraForm(Model model) {
        model.addAttribute("empilhadeira", new Empilhadeira());
        return "maquinas/add-empilhadeira";
    }

    @PostMapping("/maquinas/empilhadeira/store")
    public String addEmpilhadeira(@ModelAttribute Empilhadeira empilhadeira) {
        if (empilhadeira.getCodigo() == null || empilhadeira.getAlturaMaxima() == null || empilhadeira.getMotor() == null) {
            return "redirect:/maquinas/empilhadeira/new?erro=1";
        }

        maquinaRepository.save(empilhadeira);
        return "redirect:/maquinas/list";
    }

    @GetMapping("/maquinas/compressor/delete/{id}")
    public String deleteCompressor(@PathVariable Long id) {
        maquinaRepository.deleteById(id);
        return "redirect:/maquinas/list";
    }

    @GetMapping("/maquinas/furadeira/delete/{id}")
    public String deleteFuradeira(@PathVariable Long id) {
        maquinaRepository.deleteById(id);
        return "redirect:/maquinas/list";
    }

    @GetMapping("/maquinas/empilhadeira/delete/{id}")
    public String deleteEmpilhadeira(@PathVariable Long id) {
        maquinaRepository.deleteById(id);
        return "redirect:/maquinas/list";
    }

    // === EDITAR COMPRESSOR ===
    @GetMapping("/maquinas/compressor/edit/{id}")
    public String showEditCompressorForm(@PathVariable Long id, Model model) {
        Compressor compressor = (Compressor) maquinaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("compressor", compressor);
        return "maquinas/edit-compressor";
    }

    @PostMapping("/maquinas/compressor/update/{id}")
    public String updateCompressor(@PathVariable Long id, @ModelAttribute Compressor compressor) {
        compressor.setId(id);
        maquinaRepository.save(compressor);
        return "redirect:/maquinas/list";
    }

    // === EDITAR FURADEIRA ===
    @GetMapping("/maquinas/furadeira/edit/{id}")
    public String showEditFuradeiraForm(@PathVariable Long id, Model model) {
        Furadeira furadeira = (Furadeira) maquinaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("furadeira", furadeira);
        return "maquinas/edit-furadeira";
    }

    @PostMapping("/maquinas/furadeira/update/{id}")
    public String updateFuradeira(@PathVariable Long id, @ModelAttribute Furadeira furadeira) {
        furadeira.setId(id);
        maquinaRepository.save(furadeira);
        return "redirect:/maquinas/list";
    }

    // === EDITAR EMPILHADEIRA ===
    @GetMapping("/maquinas/empilhadeira/edit/{id}")
    public String showEditEmpilhadeiraForm(@PathVariable Long id, Model model) {
        Empilhadeira empilhadeira = (Empilhadeira) maquinaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("empilhadeira", empilhadeira);
        return "maquinas/edit-empilhadeira";
    }

    @PostMapping("/maquinas/empilhadeira/update/{id}")
    public String updateEmpilhadeira(@PathVariable Long id, @ModelAttribute Empilhadeira empilhadeira) {
        empilhadeira.setId(id);
        maquinaRepository.save(empilhadeira);
        return "redirect:/maquinas/list";
    }

    @PostMapping("/maquinas/manutencao/store")
    public String addManutencao(@ModelAttribute Manutencao manutencao) {
        manutencaoRepository.save(manutencao);
        return "redirect:/maquinas/list";
    }

    @GetMapping("/maquinas/manutencao/new/{id}")
    public String showAddManutencaoForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("manutencao", new Manutencao());
        model.addAttribute("maquina_id", id);
        model.addAttribute("funcionarios", funcionarioRepository.findAll()); // Aqui é onde o select pega os dados
        return "maquinas/add-manutencao";
    }


    @GetMapping("/funcionarios/novo")
    public String showAddFuncionarioForm(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "maquinas/add-funcionario";
    }

    @PostMapping("/funcionarios/store")
    public String addFuncionario(@ModelAttribute Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return "redirect:/maquinas/list"; // ou voltar pro formulário anterior
    }


}
