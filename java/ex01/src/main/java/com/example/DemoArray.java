package com.example;

import java.util.Scanner;

public class DemoArray {
  static Scanner scanner = new Scanner(System.in);
  public static int tamanho = aumentaArray(5);
  public static int[] array = new int[tamanho]; 

  public static void criarArray() {
    array[0] = 153;
    array[1] = 2;
    array[2] = 412;
    array[3] = 1123;
    array[4] = 2;
  }
  
  public static void limpar() {
    for (int i = 0; i < array.length; i++) {
      array[i] = 0;
      System.out.print(array[i] + ", " );
    }
  }

  public static void procurar() {
    System.out.print("Numero a procurar -> ");
    int procuraNum = scanner.nextInt();

    for (int i = 0; i < array.length; i++) {
      if (procuraNum == array[i]) {
        System.out.println("O número " + array[i] + " está na pos. " + i);
      }
    }
    System.out.println("Numero não encontrado");
  }

  public static void nSimo() {
    System.out.print("Posição a procurar -> ");
    int procuraPos = scanner.nextInt();

    for (int i = 0; i < array.length; i++) {
      if (procuraPos == i) {
        System.out.println("O número " + array[i] + " está na pos. " + i);
      }
    }
    System.out.println("Numero não encontrado");
  }

  public static void ordenar() {
    int aux = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i+1; j < array.length; j++) {
        if (array[j] < array[i]) {
          aux = array[i];
          array[i] = array[j];
          array[j] = aux;
        } 
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void pesquisaBinaria() {
    ordenar();

    int mid = array.length/2;
    int last = array.length;
    int first = 0;

    System.out.print("Número a procurar -> ");
    int number = scanner.nextInt();

    for (int i = 0; i < array.length; i++) {
      if(array[mid] == number) {
        System.out.println("Numero encontrado na posição " + mid);
        break;
      } else if (array[mid] < number) {
        first = mid + 1;
      } else {
        last = mid -1;
      }

      mid = (first + last)/2;
    }
    if (first > last){  
      System.out.println("Numero nao encontrado");  
   }  
  }

  public static void eliminaPos() {
    System.out.print("Número a eliminar -> ");
    int number = scanner.nextInt();

    for (int i = 0; i < array.length; i++) {
      
      if (number == array[i]) {
        array[i] = 0;
        System.out.println("Numero removido com sucesso!");
      }
    }
    
    for (int j = 0; j < array.length; j++) {
      System.out.print(array[j] + " ");
    }
  }

  public static void verificaRepetidos() {
    boolean encontrou = false;

    for (int i = 0; i < array.length; i++) {
      for (int j = i+1; j < array.length; j++) {
        if (array[i] == array[j]) {
          encontrou = true;
          System.out.println("Repetidos");
        }
      }
    }
    if (!encontrou) {
      System.out.println("Não há repetidos");
    }
  }

  public static int aumentaArray(int tamanho) {
    return tamanho*2;
  }
}
