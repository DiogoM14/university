import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Primeiro número:");
    int firstNumber =scanner.nextInt();
    System.out.print("Segundo número:");
    int secondNumber =scanner.nextInt();
    System.out.print("Terceiro número:");
    int thirdNumber =scanner.nextInt();
    System.out.print("Quarto número:");
    int fourthNumber =scanner.nextInt();
    System.out.print("Quinto número:");
    int fifthNumber =scanner.nextInt();

    int res = (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber)/5;

    System.out.println("O resultado é: " + res);
  }
}
