package com.company.capitulo03;

public class Pessoa {
    //conceito de interface funcional acontece pq tem 01 método

    private String name;
    private String cep;
    private boolean moderador;

    public Pessoa(String name, String cep) {
        this.name = name;
        this.cep = cep;
        this.moderador = false;
    }

    public String getName() {
        return name;
    }

    public String getCep() {
        return cep;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }

}
