import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {

    /* Recebe input pelo console */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Primeiro numero: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Segundo numero: ");
    int secondNumber = scanner.nextInt();

    int res = (secondNumber-firstNumber)*firstNumber;

    System.out.println("O Resultado é: " + res);
  }
}
