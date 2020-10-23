import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    int num1, num2, resto, i;

    num1 = 0;
    num2 = 0;
    resto = 0;
    i = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduza primeiro número: ");
    num1 = scanner.nextInt();
    System.out.print("Introduza segundo número: ");
    num2 = scanner.nextInt();

    for(i = num1; i <= num2; i++) {
      resto = i%5;

      if (resto == 0) {
        System.out.println(i);
      }
    }
  }
}


/*
Escreva um programa que leia dois números inteiros introduzidos pelo
utilizador, representando os valores início e fim de um intervalo e imprima
os múltiplos de 5 entre esse intervalo de valores.
*/