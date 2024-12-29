package com.kjs.projetoAnaliseCondicoes.service;

import com.kjs.projetoAnaliseCondicoes.model.Pessoa;
import com.kjs.projetoAnaliseCondicoes.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }


    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll(); // Busca todas as pessoas no banco de dados
    }


    public void salvar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }
}
