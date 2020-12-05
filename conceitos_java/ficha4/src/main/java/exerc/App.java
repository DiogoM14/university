package exerc;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // int opcao=0;
        // Scanner scanner = new Scanner(System.in); 

        // do {
        //     System.out.println("1 - Inicializa Array");
        //     System.out.println("2 - Lê Array");
        //     System.out.println("3 - Imprime Array");
        //     System.out.println("4 - Procura Array");
        //     System.out.println("5 - Ordena Array");
        //     System.out.println("0 - Terminar");
        //     System.out.print("\n Introduza a sua opção -> ");
        //     opcao=scanner.nextInt();

        // } while(opcao!=0);

        // switch(opcao) {
        //     case 1:
        //         inicializa();
        //         break;
        //     case 2:
        //         leitura();
        //         break;
        //     case 3:
        //         imprime();
        //         break;
        //     case 4:
        //         procura();
        //         break;
        //     case 5:
        //         ordenar();
        //         break;
        // }
    }

    public static void ex01() {
        int[] numbers = new Int[9];
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        for(i=0; i<10; i++) {
            System.out.print("Insira um número -> ");
            scanner.nextInt();

            
        }


        // Elabore um programa que leia 10 números inteiros e os ordena. No final, deve mostrar o
        // resultado ao utilizador.
    }
}
