package ficha1.src.main.java.ex06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double nota1, nota2, nota3, media;

        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        media = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Insira a primeira nota -> ");
        nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota -> ");
        nota2 = scanner.nextDouble();
        System.out.print("Insira a terceira nota -> ");
        nota3 = scanner.nextDouble();

        media = (nota1+nota2+nota3)/3;
        DecimalFormat round = new DecimalFormat( " 0.0 " );

        if (nota1>=4) {
            if(nota2>=10) {
                if(nota3>=6) {
                    System.out.print("Foste aprovado com média de " + round.format(media));
                }
            }
        } else {
            System.out.print("Foste reprovado com média de " + round.format(media));
        }
    }
}
