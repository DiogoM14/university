import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    int num1, resto, i;

    num1 = 0;
    resto = 0;
    i = 0; 

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira um número: ");
    num1 = scanner.nextInt();

    for (i = 1; i <= 10; i++) {
      resto = num1%i;

      if (resto == 0) {
        System.out.println(i);
      }
    }
  }
}


/*
Escreva um programa que calcula todos os divisores de um número inserido
pelo utilizador. Exemplo: os divisores de 10 são os números 1, 2, 5 e 10.
*/
