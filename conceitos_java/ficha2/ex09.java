import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {
    int num, produto;

    num = 0;
    produto = 1;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Insira um número -> ");
      num = scanner.nextInt();
      
      if (num%2 == 0) {
        produto=produto*num;
        System.out.println(produto);
      }
    } while (num!=0);


  }
}

/*
Escreva um programa que leia vários números inteiros e positivos dados pelo
utilizador e calcule o produto dos números pares. O fim da leitura de
números será indicado pelo número 0.
*/
