package com.kjs.projetoAnaliseCondicoes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;



@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    @JsonProperty("nome")
    private String nome;

    @Column
    @JsonProperty("idade")
    private int idade;

    @Column
    @JsonProperty("genero")
    private String genero;

    @Column
    @JsonProperty("raca")
    private String raca;

    @Column
    @JsonProperty("escolaridade")
    private String escolaridade;

    @Getter
    @Column
    @JsonProperty("estadoCivil")
    private String estadoCivil;

    @Column
    @JsonProperty("emprego")
    private String emprego;

    @Column
    @JsonProperty("auxilio")
    private String auxilio;

    @Column
    @JsonProperty("dependentes")
    private String dependentes;

    @Column
    @JsonProperty("religiao")
    private String religiao;


    public String getNome() {
        return nome;
    }
}
