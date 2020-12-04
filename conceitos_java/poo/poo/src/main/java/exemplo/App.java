package exemplo;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa("Diogo", 70, 173, 18);   // Inicializa p1 como Objeto Pessoa()

        System.out.println(p1.getNome() + " " + p1.getPeso() + " " + p1.getAltura() + " " + p1.getIdade());
        // System.out.println(p1.setNome());
    }
}
