package com.ex08;

public class BinarySearch {

  public static <T extends Comparable<? super T>> boolean linearSearch(T[] marca, int min, int max, T target) {
    int index = min;
    boolean found = false;

    while (!found && index <= max) {
        if (marca[index].compareTo(target) == 0) {
            found = true;
        }
        index++;
    }
    return found;
}
}
