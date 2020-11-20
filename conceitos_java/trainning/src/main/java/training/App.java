package training;

import java.util.Scanner;

public class App 
{
    static int[] numeros = new int[5];
    
    public static void main( String[] args )
    {
        inicializa();
        imprime();
        procura();
        ordenar();
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
}
