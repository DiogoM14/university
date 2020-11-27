package exerc;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    static int[] array1 = new int[10];
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("\n Escolha umas das opções: ");
            System.out.println("1. Exercício 1 ");
            System.out.println("2. Exercício 2 ");
            System.out.print("Introduza a sua opção -> ");
            opcao=scanner.nextInt();
            
        } while(opcao==0); 
        
        switch(opcao) {
            case 1:
                ex01();
                break;
            case 2:
                ex01();
                break;
            default:
                break;
        }
    }
    
    public static void ex01()
    {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        
        do {
            System.out.println("\n Escolha umas das opções: ");
            System.out.println("1. Carregar um array com 10 valores inteiros ");
            System.out.println("2. Pesquisar um valor, e indicar ao utilizador se o valor existe dentro do array ");
            System.out.println("3. Ordenar o array por ordem crescente e mostrar o resultado ao utilizador ");
            System.out.println("4. Ordenar o array por ordem decrescente e mostrar o resultado ao utilizador ");
            System.out.println("5. Somar todas as posições do array e mostrar o resultado ");
            System.out.println("6. Encontrar o maior valor e mostrar o resultado ao utilizador ");
            System.out.println("7. Encontrar o menor valor e mostrar o resultado ao utilizador ");
            System.out.print("Introduza a sua opção -> ");
            opcao=scanner.nextInt();
            
        } while(opcao==0); 
        
        switch(opcao) {
            case 1:
                ex01a();
                ex01();
                break;
            case 2:
                ex01b();
                ex01();
                break;
            case 3:
                ex01c();
                ex01();
                break;
            case 5:
                ex01e();
                ex01();
                break;
            case 6:
                ex01f();
                ex01();
                break;
            case 7:
                ex01g();
                ex01();
                break;
            default:
                break;
        }
    }
    
    
    public static void ex01a()
    {
        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.print("\n");
        
        for(i=0;i<array1.length;i++) {
            System.out.print("Introduza um número para a posição " + i + " -> ");
            array1[i]=scanner.nextInt();
        }
    }
    
    public static void ex01b()
    {
        int i;
        
        Arrays.sort(array1);
        System.out.print("\n");
        
        for(i=1;i<array1.length;i++) {
            if(array1[i] == array1[i-1]) {
                System.out.print("O valor " + array1[i] + " está repetido! \n");
            }
        }
        pausa();
    }

    public static void ex01c()
    {
        int i;
        Arrays.sort(array1);

        System.out.print("\n Os valores do array são [");
        
        for(i=1;i<array1.length;i++) {
            System.out.print(array1[i] + ", ");
        }

        System.out.println("]");
        pausa();
    }
 
    public static void ex01e()
    {
        int i, soma;
        soma= 0;
        for(i=0;i<array1.length;i++) {
            soma=soma+array1[i];
        }
        System.out.print("A soma do array é " + soma);
    }
     
    public static void ex01f()
    {
        int i, maior;
        
        maior=array1[0];
        for(i=1;i<array1.length;i++) {
            if(array1[i]>maior)
                maior=array1[i];
        }
    }

    public static void ex01g()
    {
        int i, menor;
        
        menor=array1[0];
        for(i=1;i<array1.length;i++) {
            if(array1[i]<menor)
                menor=array1[i];
        }
    }

    public static void pausa()
    {
        String Str = " ";

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Pressione alguma tecla para continuar");
        Str=scanner.nextLine(); 

        if(Str == " ") {
            ex01();
        }
    }
}

// d. Ordenar o array por ordem decrescente e mostrar o resultado ao utilizador