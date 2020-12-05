package ficha6;

import java.util.Scanner;

public class App 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        UsaPessoa();
        UsaCarro();
    }

    public static void UsaPessoa()
    {
        Pessoa p1 = new Pessoa("Diogo", 18, 172, 70);
        Pessoa p2 = new Pessoa("Irineu", 42, 192, 85);
        
        // System.out.println(p1.getNome() + " -> Idade-> " + p1.getIdade() + " Altura-> " + p1.getAltura() + " Peso-> " + p1.getPeso());
        // System.out.println(p2.getNome() + " -> Idade-> " + p2.getIdade() + " Altura-> " + p2.getAltura() + " Peso-> " + p2.getPeso());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    public static void UsaCarro()
    {
        Carro carro1 = new Carro("Azul", 2000, 5, 120);
        Carro carro2 = new Carro("Amarelo", 1200, 3, 70);

        System.out.println("\n" + carro1.toString());
        System.out.println(carro2.toString());
    }
}
