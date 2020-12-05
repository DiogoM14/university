package ficha1.src.main.java.ex03;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double num1, num2, num3, maior;

        num1 = 0;
        num2 = 0;
        num3 = 0;
        maior = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira o primeiro número -> ");
        num1 = scanner.nextDouble();
        System.out.print("Insira o segundo número -> ");
        num2 = scanner.nextDouble();
        System.out.print("Insira o terceiro número -> ");
        num3 = scanner.nextDouble();

        if (num1>num2 && num1>num3) {
            maior = num1;
        } else if(num2>num1 && num2>num3) {
            maior = num2;
        } else {
            maior = num3;
        }
        System.out.println("O resultado é " + maior);
    }
}
