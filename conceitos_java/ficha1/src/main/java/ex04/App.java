package ficha1.src.main.java.ex04;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double nota;

        nota = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira a sua nota -> ");
        nota = scanner.nextDouble();

        if (nota>=10) {
            System.out.println("Parabéns a tua nota é " + nota);

        } else {
            System.out.println("Marque um novo exame, a tua nota é " + nota);

        }
    }
}
