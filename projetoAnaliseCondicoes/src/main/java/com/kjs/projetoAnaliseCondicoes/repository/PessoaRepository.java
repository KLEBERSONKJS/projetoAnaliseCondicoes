package com.kjs.projetoAnaliseCondicoes.repository;

import com.kjs.projetoAnaliseCondicoes.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {


}
