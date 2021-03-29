package exercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();

        lista.add("Psychotron");
        lista.add("Captive Honour");
        lista.add("Ashes in Your Mouth");
        lista.add("This Was My Life");
        lista.add("Sweating Bullets");

        System.out.println(lista);
        try {
            lista.remove("This Was My Life");
        } catch (EmptyCollectionException ex) {
            Logger.getLogger(DemoLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ElementNotFoundException ex) {
            Logger.getLogger(DemoLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(lista);
    }
}
