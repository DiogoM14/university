
package com.mycompany.aed.aula2;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArray<T extends Comparable<? super T>> {

    // public class DemoArray<T> implements Comparable{

    private T[] array;
    private int tamanho;

    public DemoArray() {
        // array= (T[])(new Object[100]);
        array = (T[]) (new Comparable[100]);
        tamanho = 0;

    }

    public void limpa() {
        for (int i = 0; i < tamanho; i++)
            array[i] = null;

    }

    public int procura(T elem) {
        int enc = -1;

        for (int i = 0; i < tamanho; i++)
            if (array[i].equals(elem))
                enc = 1;
        return enc;

    }

    public T nesimo(int pos) {
        if (pos <= tamanho)
            return array[pos];
        else
            return null;
    }

    public void add(T elem) {
        array[tamanho] = elem;
        tamanho++;

    }

    public void ordena() {

        T aux;
        for (int i = 0; i < tamanho; i++)
            for (int j = i; j < tamanho; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }

            }

    }

    public int remove(T elem) {

        int enc, ok = 0;

        enc = this.procura(elem);
        if (enc != -1) {
            if (enc == this.tamanho - 1)
                this.array[enc] = null;
            else {
                for (int i = enc; i < this.tamanho; i++) {
                    this.array[i] = this.array[i + 1];
                }
                ok = 1;
            }
        } else
            ok = 0;
        return ok;
    }

    @Override
    public String toString() {
        String result = "DemoArray->";

        for (int i = 0; i < tamanho; i++) {
            result = result + "\t" + array[i];

        }
        return result;
    }

}
