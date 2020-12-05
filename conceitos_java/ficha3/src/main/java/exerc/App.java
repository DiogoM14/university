package exerc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int quest = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o exercício que pretende executar? ");
        quest = scanner.nextInt();

        System.out.println("Executando exercício " + quest);
        ex05();
    }

    public static void ex01() {
        char[] sentence = {'e', 'u', ' ', 's', 'o', 'u', ' ', 'a', 'l', 'u', 'n', 'o', ' ', 'd', 'o', ' ', 'E', 'S', 'T', 'G'};

        for (int i = 0; i<sentence.length; i++) {
            System.out.print(sentence[i]);
        }
    }

    public static void ex02() {
    int[][] matriz = {{ 11,7,333}, { -20,-23,63}, { -22,501,10000}};
    int soma = 0, linhas = 0, colunas = 0;
    float media = 0;

    for (linhas = 0; linhas < 3; linhas++) {
      for (colunas = 0; colunas < 3; colunas++) {
        soma = soma + matriz[linhas][colunas];
      }
    }

    System.out.println("A soma da matriz é " + soma);
    media = (float) soma / 9;
    System.out.println("A média da matriz é " + media);
  }

    public static void ex03() {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int  i, numNegativos, maior;
        int multiplicacao = 1;
        int listaLength = lista.length;

        i=numNegativos=maior=0;

        for(i = 0; i<listaLength; i++) {
            if(lista[i] > -1) {
                multiplicacao=multiplicacao*lista[i];
            } else if(lista[i] !=0) {
                numNegativos++;
            }
            if(lista[i]>maior) {
                maior=lista[i];
            }
        }

        System.out.println("A multiplicação entre todos os números é =>" + multiplicacao);
        System.out.println("Existem " + numNegativos + " números negativos");
        System.out.println("O maior número é " + maior );
    }

    public static void ex04() {
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int i = 0, primeroEspaco = 0;

        if(nome[i]==' ') {
            primeroEspaco = i;
        }

        for(i=primeroEspaco+1;i<nome.length; i++) {
            System.out.print(nome[i] + ", ");
        }

        for (i=0; i<primeroEspaco; i++) {
            System.out.print(nome[i]);
        }
    }

    public static void ex05() {
        String[] nomeCompleto = new String[2]; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o seu primeiro nome -> ");
        nomeCompleto[0] = scanner.nextLine();
        String[] splited = nomeCompleto[0].split(" ");
        nomeCompleto[0] = splited[0];
        
        System.out.print("Insira o seu apelido -> ");
        nomeCompleto[1] = scanner.nextLine();
        String[] splited2 = nomeCompleto[1].split(" ");
        nomeCompleto[1] = splited2[0];

        System.out.println(nomeCompleto[1] + " " + nomeCompleto[0]);
    }

    // Escreva um programa que através da sua invocação a partir da linha de comandos, receba dois parâmetros
    // correspondentes ao primeiro e último nome de uma pessoa e apresente no ecrã esse nome no seguinte
    // formato: apelido, nome.

    public static void ex06() {
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2, -35};

        int i = 0;

        int[] novaLista = new int[listaA.length + listaB.length];

        System.arraycopy(listaA, 0, novaLista, 0, listaA.length);
        System.arraycopy(listaB, 0, novaLista, listaA.length, listaB.length);

        Arrays.sort(novaLista);   

        System.out.print("\n[ ");
        for (i = 0; i<novaLista.length; i++) {
            int arrayNumber = novaLista[i];
            System.out.print( arrayNumber);
            System.out.print(", ");
        }
        System.out.print(" ] \n");

        for(int j = 1; j<novaLista.length; j++) {
            if(novaLista[j] == novaLista[j-1]) {
                System.out.println("O numero " + novaLista[j] + " está repetido");
            }
        }
    }
}
// Escreva um programa que permita:
// a. Unir os dois vetores num novo vetor. Imprima o vetor resultante;
// b. Apresente quantos elementos repetidos existem no vetor criado na alínea a;
// c. Preencher um novo vetor com os elementos do vetor: “listaA” que não se encontram no vetor:
// ”listaB”;
// d. Preencher um novo vetor com os elementos que se encontram simultaneamente nos dois vetores
// (sem repetidos).
