package com.mycompany.aed.aula2;

import java.util.ArrayList;
import java.util.Collections;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DoubleLinkedList<Integer> lista = new DoubleLinkedList<Integer>();

        DemoArray<String> teste = new DemoArray<>();
        DemoArray<Pessoa> teste2 = new DemoArray<>();
        DemoArray<Carro> teste3 = new DemoArray<>();

        DemoArraylist<String> teste5 = new DemoArraylist();
        DemoArraylist<Pessoa> teste6 = new DemoArraylist();

        teste5.add("ee");
        teste5.add("zz");
        teste5.add("kkk");

        System.out.println(teste5.toString());

        teste5.ordena();
        System.out.println(teste5.toString());
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setMarca("porsche");
        c1.setModelo("911");
        c2.setMarca("audi");
        c2.setModelo("TT");

        teste3.add(c1);
        teste3.add(c2);
        System.out.println(teste3.toString());
        teste3.ordena();
        System.out.println(teste3.toString());

        p1.setNome("Carlos");
        p1.setEmail("carlos@gmail.com");

        teste2.add(p1);
        p2.setNome("Artur");
        p2.setEmail("artur@gmail.com");

        teste2.add(p2);
        System.out.println(teste2.toString());
        System.out.println(teste2.procura(p2));
        teste2.ordena();
        System.out.println(teste2.toString());

        teste6.add(p1);
        teste6.add(p2);
        System.out.println(teste6.toString());
        teste6.ordena();
        System.out.println(teste6.toString());

        teste.limpa();
        teste.add("João");
        teste.add("Ana");
        teste.add("Pedro");
        System.out.println(teste.nesimo(2));
        System.out.println(teste.procura("Ana"));
        System.out.println(teste.procura("José"));

        System.out.println(teste.toString());
        teste.ordena();
        System.out.println(teste.toString());

    }

}
