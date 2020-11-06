import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] num = {0, -1, 1, 1, 2};

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Insira um número -> ");
      num[0] = scanner.nextInt();
    }
    
    int arrayLength = num.length;
    num = Arrays.stream(num).filter(x -> x > 0).toArray();
    int arrayFilteredLength = num.length;
    int percPositivos = (100*arrayFilteredLength)/arrayLength;

    // num = Arrays.stream(num).filter(x -> x < 0).toArray();
    // int arrayFilteredLengthNegativos = num.length;
    // int percNegativos = (100*arrayFilteredLengthNegativos)/arrayLength;

    int arrayLengthNegativos = arrayLength-arrayFilteredLength;
    int percNegativos = (100*arrayLengthNegativos)/arrayLength;

    System.out.println("A percentagem de números positivos é de " + percPositivos + "%");
    System.out.println("A média de números negativos é de " + percNegativos + "%");
  }
}

/*
Crie um programa que lê vários números inteiros (negativos e positivos)
dados pelo utilizador e determina a percentagem de números positivos e a
média dos números negativos lidos.
*/