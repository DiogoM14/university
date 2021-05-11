package com.ex08;

public class Carro {
  private String modelo;
  private String marca;
  private String matricula;

  public Carro() {
  }

  public Carro(String modelo, String marca, String matricula) {
    this.modelo = modelo;
    this.marca = marca;
    this.matricula = matricula;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "{" +
      " modelo='" + getModelo() + "'" +
      ", marca='" + getMarca() + "'" +
      ", matricula='" + getMatricula() + "'" +
      "}";
  }
}
