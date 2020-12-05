import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    float saldo, montante, res;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduza o saldo: ");
    saldo = scanner.nextInt();
    System.out.print("Introduza o montante a debitar/creditar: ");
    montante = scanner.nextInt();

    res = saldo + (montante);

    if (res < 0) {
      System.out.println("Impossível realizar operação");
    } else {
        System.out.print("Débito ou crédito realizado com sucesso, o saldo total da conta é de: " + res + "$");
      }
  }
}

/*
Escreva um programa que, após pedir ao utilizador o saldo de uma conta
bancária (considere que é introduzido um valor positivo) e montante a
debitar/creditar (valor positivo ou negativo, respetivamente), verifique se
a operação é possível, i.e., se o saldo se mantém positivo após a operação, 
e apresente ao utilizador o resultado da operação, que pode ser
um dos seguintes:

a) Débito ou crédito realizado com sucesso (acompanhado de
informação sobre o valor do saldo após a operação);
b) Operação impossível por saldo insuficiente.
*/
