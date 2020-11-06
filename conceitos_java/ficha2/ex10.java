import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    int num, maior;

    num = 0;
    maior = 0;

    Scanner scanner = new Scanner(System.in);

    while (num!=-1) {
      System.out.print("Insira um número -> ");
      num = scanner.nextInt();

      if (num>maior) {
        maior = num;
      }

      if(num==-1) {
        System.out.println("O maior número é " + maior);
      }
    }
  }
}
