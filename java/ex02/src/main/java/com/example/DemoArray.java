package com.example;

public class DemoArray {
  public static <T extends Comparable<? super T>> boolean searchPessoa(T[] pessoas, int length, T target) {

    boolean found = false;

    for (int i = 0; i < length; i++) {
      if (pessoas[i].compareTo(target) == 0) {
        found = true;
      }
    }

    return found;
  }
}
