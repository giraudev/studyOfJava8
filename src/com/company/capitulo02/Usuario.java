package com.company.capitulo02;

class Usuario {
    private String name;
    private int pontos;
    private boolean moderador;

    public Usuario(String name, int pontos) {
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
