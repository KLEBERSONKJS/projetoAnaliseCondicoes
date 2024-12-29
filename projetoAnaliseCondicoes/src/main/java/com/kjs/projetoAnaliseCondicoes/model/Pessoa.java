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

    @Getter
    @Column
    @JsonProperty("genero")
    private String genero;

    @Getter
    @Enumerated(EnumType.STRING)
    @JsonProperty("raca")
    private Raca raca;

    @Getter
    @Enumerated(EnumType.STRING)
    @JsonProperty("escolaridade")
    private Escolaridade escolaridade;

    @Getter
    @Enumerated(EnumType.STRING)
    @JsonProperty("estadoCivil")
    private EstadoCivil estadoCivil;

    @Column
    @JsonProperty("emprego")
    private String emprego;

    @Column
    @JsonProperty("auxilio")
    private String auxilio;

    @Getter
    @Enumerated(EnumType.STRING)
    @JsonProperty("dependentes")
    private Dependentes dependentes;

    @Column
    @JsonProperty("religiao")
    private String religiao;


    public String getNome() {
        return nome;
    }
}
