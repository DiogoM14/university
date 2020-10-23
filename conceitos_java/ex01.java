import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    int firstNumber, secondNumber, res;

    /* Recebe input pelo console */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Primeiro numero: ");
    firstNumber = scanner.nextInt();
    System.out.print("Segundo numero: ");
    secondNumber = scanner.nextInt();

    res = (secondNumber-firstNumber)*firstNumber;

    System.out.println("O Resultado é: " + res);
  }
}
