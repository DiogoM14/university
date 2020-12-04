package ficha6;

public class Pessoa {
  private String nome;
  private int idade, altura;
  private float peso;
  
  public Pessoa(String name, int age, int height, float weight) {
    this.nome=name;
    this.idade=age;
    this.altura=height;
    this.peso=weight;
  }
  
  public String getNome() {
    return this.nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getIdade() {
    return this.idade;
  }
  
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public int getAltura() {
    return this.altura;
  }
  
  public void setAltura(int altura) {
    this.altura = altura;
  }
  
  public float getPeso() {
    return this.peso;
  }
  
  public void setPeso(float peso) {
    this.peso = peso;
  }
  
  @Override
  public String toString() {
    return "{" +
    " nome='" + getNome() + "'" +
    ", idade='" + getIdade() + "'" +
    ", altura='" + getAltura() + "'" +
    ", peso='" + getPeso() + "'" +
    "}";
  }
  
}
