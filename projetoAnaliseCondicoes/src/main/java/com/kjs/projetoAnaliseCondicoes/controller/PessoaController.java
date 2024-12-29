package com.kjs.projetoAnaliseCondicoes.controller;

import com.kjs.projetoAnaliseCondicoes.model.Pessoa;
import com.kjs.projetoAnaliseCondicoes.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;


    @GetMapping("/pessoas")
    @ResponseBody
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarTodas();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        try {
            pessoaService.salvar(pessoa);
            String pessoaCadastrada = pessoa.getNome();
            return ResponseEntity.ok("O cadastro de " + pessoaCadastrada + " teve exito!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }
}
