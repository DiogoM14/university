import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    int num, soma, i;
    float media;

    soma=0;
    media=0;

    Scanner scanner = new Scanner(System.in);

    for (i=1; i<=5;i++) {
      System.out.print("Introduza um numero: ");
      num = scanner.nextInt();
      soma=soma+num;
    }

    media=(float)soma/5;
    System.out.println("O resultado é: " + media);
  }
}
