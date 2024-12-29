package com.kjs.projetoAnaliseCondicoes.model;

public enum Dependentes {

    NENHUM("nenhum"),
    UM("1"),
    DOIS("2"),
    TRES("3"),
    QUARTRO("4"),
    CINCO("5"),
    CINCOOUMAIS("5 ou mais"),
    PREFERENAODIZER("prefere nao dizer");

    private final String descicao;

    Dependentes(String descicao) {
        this.descicao = descicao;
    }

    public String getDescicao() {
        return descicao;
    }
}
