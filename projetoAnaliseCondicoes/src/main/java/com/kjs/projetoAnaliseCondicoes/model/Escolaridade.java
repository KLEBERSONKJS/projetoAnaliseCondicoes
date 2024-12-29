package com.kjs.projetoAnaliseCondicoes.model;

public enum Escolaridade {
    ENSINOMÉDIOINCOMPLETO("medio incompleto"),
    ENSINOMÉDIOCOMPLETO("medio completo"),
    GRADUAÇÃOINCOMPLETA("graduacao incompleta"),
    GRADUAÇÃOCOMPLETA("graduacao completa"),
    ENSINOFUNDAMENTALINCOMPLETO("fudamental incompleto"),
    ENSINOFUNDAMENTALCOMPLETO("fudamental completo"),
    PREFERENÃODIZER("prefere nao dizer");

    private final String descricao;

    Escolaridade(String descricao) {
        this.descricao = descricao;
    }

    public  String getDescricao(){
        return descricao;
    }


}
