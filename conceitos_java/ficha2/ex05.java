import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    int x, y;

    x = 0;
    y = 0;

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Insira um número -> ");
    x = scanner.nextInt();
    
    if(x<1) {
      y=x;
    } 
    else if(x==1) {
      y=0;
    } 
    else {
      y = 2*x;
    }
    System.out.println(y);
  }
}


/* 
Escreva um programa que leia um número X e calcule o valor de Y de acordo
com as condições a seguir:
                    Y ← X se X < 1
                    Y ← 0 se X = 1
                    Y ← 2X se X > 1
*/