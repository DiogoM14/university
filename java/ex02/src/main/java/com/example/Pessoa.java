package com.example;

import java.util.Objects;

public class Pessoa implements Comparable {
  private String nome;
  private String morada;
  private String email;
  private int telefone;

  public Pessoa() {
  }

  public Pessoa(String nome, String morada, String email, int telefone) {
    this.nome = nome;
    this.morada = morada;
    this.email = email;
    this.telefone = telefone;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + nome + "'" +
      ", morada='" + morada + "'" +
      ", email='" + email + "'" +
      ", telefone='" + telefone + "'" +
      "}";
  }

  @Override
  public int compareTo(Object o) {
    int result;

    if (nome.equals(((Pessoa) o).nome)) {
        result = nome.compareTo(((Pessoa) o).nome);
    } else {
        result = nome.compareTo(((Pessoa) o).nome);
    }

    return result;
  }  
}
