package ficha6_p2;

public class Pessoa {
  String nome;
  char genero;
  int idade;

  public Pessoa(String nome, char genero, int idade) {
    this.nome = nome;
    this.genero = genero;
    this.idade = idade;
  }


  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getGenero() {
    return this.genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  void falar(String printNome) {
    System.out.println(printNome + "Disse-> Blá, blá, blá...");
  }


  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", genero='" + getGenero() + "'" +
      ", idade='" + getIdade() + "'" +
      "}";
  }

}
