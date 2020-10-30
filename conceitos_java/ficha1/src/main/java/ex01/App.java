package ficha1.src.main.java.ex01;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int num1, num2, res;

        num1 = 0;
        num2 = 0;
        res = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número -> ");
        num1 = scanner.nextInt();
        System.out.print("Insira o segundo número -> ");
        num2 = scanner.nextInt();

        res = num1 + num2;

        System.out.print("Resultado -> " + res);
    }
}
