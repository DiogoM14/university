package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoArrayList {
  static ArrayList<Integer> array = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);

  public static void createArrayList() {
      array.add(112);
      array.add(34);
      array.add(99);
      array.add(12);
      array.add(500);
      System.out.println(array);
  }

  public static void limparArrayList() {
      array.clear();
      System.out.println(array);

  }

  public static void procurarElemento() {
      int numero, pos;
      System.out.print("Introduza o número a procurar: ");
      numero = scanner.nextInt();

      pos = array.indexOf(numero);

      if (pos != -1) {
        System.out.println("Posição " + pos);
      } else {
        System.out.println("NÃO EXISTE");
      }
  }

  public static void procurarNsimo() {
    int numero, pos;
    System.out.print("Posição a procurar: ");
    pos = scanner.nextInt();

    try {
      numero = array.get(pos);
      System.out.println("Numero na posição é " + numero);
    } catch(Exception e) {
      System.out.println("Erro!");
    }
  }

  public static void orderaArray() {
    Collections.sort(array);

    System.out.println("Array ordenado" + array);
  }

  public static void binarySearch() {
    int pos, numero;
    System.out.print("Posição a procurar: ");
    numero = scanner.nextInt();

    Collections.sort(array);
    pos = Collections.binarySearch(array, numero);

    if (pos != 1) {
      System.out.println("Numero na posição é " + array.indexOf(numero));
    } else {
      System.out.println("CALMA RUI!");
    }
  }

  public static void removeNumber() {
    int pos, numero;
    System.out.print("Numero a remover: ");
    numero = scanner.nextInt();

    pos = array.indexOf(numero);

    try {
      array.remove(pos);
      System.out.println("Numero removido " + array);
    } catch(Exception e) {
      System.out.println("CALMA RUI!");
    }
  }

  public static void removeRepitidos() {
    int pos, numero;
    
  }
}
