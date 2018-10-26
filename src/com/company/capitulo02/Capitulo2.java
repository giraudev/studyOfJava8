package com.company.capitulo02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Nome 1", 150);
        Usuario user2 = new Usuario("Nome 2", 120);
        Usuario user3 = new Usuario("Nome 3", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getName());
        }

        usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getName());
            }
        });

        //usando lambda:
        Consumer<Usuario> mostrador = (Usuario w) -> System.out.println(w.getName());

        //ou
        usuarios.forEach( x -> System.out.println(x.isModerador()));

        usuarios.forEach(u -> u.tornaModerador());

        usuarios.forEach( x -> System.out.println(x.isModerador()));

    }
}
