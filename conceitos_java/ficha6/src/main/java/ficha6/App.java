package ficha6;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa("Diogo", 18, 172, 70);
        Pessoa p2 = new Pessoa("Irineu", 42, 192, 85);
        
        // System.out.println(p1.getNome() + " -> Idade-> " + p1.getIdade() + " Altura-> " + p1.getAltura() + " Peso-> " + p1.getPeso());
        // System.out.println(p2.getNome() + " -> Idade-> " + p2.getIdade() + " Altura-> " + p2.getAltura() + " Peso-> " + p2.getPeso());

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
