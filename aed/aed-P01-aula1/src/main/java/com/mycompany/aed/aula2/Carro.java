package com.mycompany.aed.aula2;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String marca, modelo;
    private int km, potencia;

    public Carro() {
        this.marca = null;
        this.modelo = null;
        this.potencia = 0;
        this.km = 0;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.km != other.km) {
            return false;
        }
        if (this.potencia != other.potencia) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Carro c) {

        return this.marca.compareTo(c.getMarca());

    }

    @Override
    public String toString() {
        return "Pessoa{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

}
