package com.company.capitulo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main04 {

    //todo: Métodos defaults foram adicionados para permitir que interfaces evoluam sem quebrar código existente

    public static void main(String[] args) {
        Dados d1 = new Dados("dado1", 150);
        Dados d2 = new Dados("dado2", 1500);
        Dados d3 = new Dados("dado3", 1);
        Dados d4 = new Dados("dado4", 5);
        Dados d5 = new Dados("dado5", 15000);
        Dados d6 = new Dados("dado6", 100);


        List<Dados> dadosList = Arrays.asList(d1, d2, d3, d4, d5, d6);

        Consumer<Dados> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");

        Consumer<Dados> imprimeNomes = u -> System.out.println(u.getName());

        //interface funcional tem apenas 1 método abstrato, mas tem outro metodo que é default: andThen
        dadosList.forEach(mostraMensagem.andThen(imprimeNomes));
        System.out.println(" ");

        Predicate<Dados> predicate = new Predicate<Dados>() {
            @Override
            public boolean test(Dados dados) {
                return dados.getPontos()>160;
            }
        };
        List<Dados> dadosList2 = new ArrayList<>();
        dadosList2.add(d1);
        dadosList2.add(d2);
        dadosList2.add(d3);
        dadosList2.add(d4);
        dadosList2.add(d5);
        dadosList2.add(d6);

        dadosList2.removeIf(predicate);
        dadosList2.forEach(u -> System.out.println(u.getName()));


    }
}
