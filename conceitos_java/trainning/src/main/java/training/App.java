package training;

import java.util.Scanner;

public class App 
{
    static int[] numeros = new int[5];
    
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

        inicializa();
        leitura();
        imprime();
        procura();
        ordenar();
        repetido();
    }
    
    public static void inicializa() {   // Inicializa todos os elementos do array até 1
        int i;
        
        for(i=0;i<numeros.length; i++) {
            numeros[i]=-1;
        }
    }
    
    public static void imprime() {
        int i;
        for(i=0;i<numeros.length;i++) {
            System.out.println("Valor da posição" + i + " -> " + numeros[i]);
        }
    }
    
    public static void procura() {
        int numero, index, i;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduza um número a pesquisar -> ");
        numero=scanner.nextInt();
        
        index=-1;
        i=0;
        
        while(index==-1 && i<numeros.length) {
            if(numeros[i]==numero)
            index=i;
            i++;
        }
        if(index==-1)
        System.out.println("Não existe!");
        else    
        System.out.println("O numero " + numero + " existe na posição " + i);
    }
    
    public static void ordenar() {
        int i, j, aux;
        
        for(i=0;i<numeros.length;i++) {
            for(j=0;j<numeros.length;j++) {
                if(numeros[j]<numeros[i]){
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
    }

    public static void leitura() {
        Scanner scanner = new Scanner(System.in);
        
        int i;

        for(i=0; i<numeros.length;i++) {
            System.out.print("Introduza um número para a posição " + i + " ->");
            numeros[i]=scanner.nextInt();
        }
    }

    public static void repetido() {
        int i;

         for(i = 1; i<numeros.length; i++) {
            if(numeros[i] == numeros[i-1]) {
                System.out.println("O numero " + numeros[i] + " está repetido");
            }
        }
    }
}
