package com.company.capitulo03;

public class Main03 {
    //todo: interface funcional com método abstrato

    public static void main(String[] args) {

        String cepCerto = "12305-670";
        String cepErrado = "12305-670";

        Long numCerto = Long.valueOf(4);
        Long numErrado = Long.valueOf(9);


        Validator<String> validadorCEP = new Validator<String>() {
            @Override
            public boolean valida(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validator<String> validatorCEP = valor -> {
            return valor.matches("[0-9]{5}-[0-9]{3}");
        };

        Validator<Long> validarNum = num -> {
            return num.equals(Long.valueOf(4));
        };

        System.out.println("cep certo: " + validadorCEP.valida(cepCerto));
        System.out.println("cep errado: " + validatorCEP.valida(cepErrado));

        System.out.println("num certo: " + validarNum.valida(numCerto));
        System.out.println("num errado: " + validarNum.valida(numErrado));

        final int numero = 5;
        //pode acessar a variavel local que não é final
        new Thread(() -> {
            System.out.println(numero);
        }).start();

        int num2 = 5455;
        new Thread(() -> {
            System.out.println(num2);
        }).start();
/*
    porem, se colocar a linha abaixo:
        num2 = 5555555;
    não vai compilar: Error:(43, 32) java: local variables referenced from a lambda expression must be final or effectively final
*/
    }
}
