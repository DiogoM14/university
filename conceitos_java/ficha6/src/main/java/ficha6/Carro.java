package ficha6;

public class Carro {
  private String cor;
  private int cilindrada, numeroPortas, potencia;

  public Carro(String cor, int cilindrada, int numeroPortas, int potencia) {
    this.cor=cor;
    this.cilindrada=cilindrada;
    this.numeroPortas=numeroPortas;
    this.potencia=potencia;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getCilindrada() {
    return this.cilindrada;
  }

  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  public int getNumeroPortas() {
    return this.numeroPortas;
  }

  public void setNumeroPortas(int numeroPortas) {
    this.numeroPortas = numeroPortas;
  }

  public int getPotencia() {
    return this.potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  @Override
  public String toString() {
    return "{" +
      " cor='" + getCor() + "'" +
      ", cilindrada='" + getCilindrada() + "'" +
      ", numeroPortas='" + getNumeroPortas() + "'" +
      ", potencia='" + getPotencia() + "'" +
      "}";
  }
  
}
