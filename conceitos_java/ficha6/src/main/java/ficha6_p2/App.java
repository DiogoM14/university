package ficha6_p2;

public class App {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Diogo", 'M', 18);
    Pessoa pessoa2 = new Pessoa("João", 'M', 10);
    Pessoa pessoa3 = new Pessoa("Maria", 'F', 26);

    pessoa1.falar("Diogo");
    System.out.println(pessoa2.toString() + " " + pessoa3.toString());
  }
}
