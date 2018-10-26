package com.company.capitulo04;

public class Dados {

    private String name;
    private int pontos;
    private boolean moderador;

    public Dados(String name, int pontos) {
        this.name = name;
        this.pontos = pontos;
        this.moderador = false;
    }

    public String getName() {
        return name;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
}

