package ficha1.src.main.java.ex05;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double precoAtual, precoAnterior, percentagem;

        precoAtual = 0;
        precoAnterior = 0;
        percentagem = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira o preco atual -> ");
        precoAtual = scanner.nextDouble();
        System.out.print("Insira o preco anterior -> ");
        precoAnterior = scanner.nextDouble();

        percentagem = (precoAtual-precoAnterior)/precoAnterior*100;

        if (percentagem>=5) {
            System.out.println("RESULTADO: " + percentagem + "% - Aumento EXCESSIVO!");

        } else {
            System.out.println("Dentro do padrão");

        }
    }
}
