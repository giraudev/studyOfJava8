package com.company.capitulo03;

@FunctionalInterface
interface Validator <T>{
    boolean valida(T t);

}

//  @FuncionalInterface: declara explicitamente que é uma interface funcional, só funciona com 1 método
/*Error:(3, 1) java: Unexpected @FunctionalInterface annotation
  com.company.capitulo03.Validator is not a functional interface
    multiple non-overriding abstract methods found in interface com.company.capitulo03.Validator*/