package com.example;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) {
        Pessoa[] pessoas = new Pessoa[7];

        pessoas[0] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[1] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[2] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[3] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[4] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[5] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);
        pessoas[6] = new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191);

        System.out.println(DemoArray.searchPessoa(pessoas, pessoas.length, new Pessoa("Diogo Martins", "Rua das ruas", "gmail@diogo.com", 91919191)));
    }
}
