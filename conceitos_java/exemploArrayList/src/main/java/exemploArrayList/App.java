package exemploArrayList;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList lista = new ArrayList();

        System.out.println(lista.size());

        lista.add("Arroz");
        lista.add("Arroz");
        lista.add("Pato");

        lista.remove("Arroz");

        System.out.println(lista);
    }
}
