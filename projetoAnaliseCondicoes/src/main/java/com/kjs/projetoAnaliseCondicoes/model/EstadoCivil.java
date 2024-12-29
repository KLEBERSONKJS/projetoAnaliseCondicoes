package com.kjs.projetoAnaliseCondicoes.model;

public enum EstadoCivil {
    CASADO("casado"),
    VIUVO("viuvo"),
    DIVORCIADO("divorciado"),
    SEPARADO("separado"),
    SOLTEIRO("solteiro"),
    PREFERENAODIZER("prefere nao dizer");

    public final String descricao;

    EstadoCivil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
