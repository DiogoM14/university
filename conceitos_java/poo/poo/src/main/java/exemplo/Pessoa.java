package exemplo;

public class Pessoa {
    private String nome;    // Private => Só a class é que altera o objeto
    private float peso, altura;
    private int idade;

    public Pessoa(String name, float weight, float height, int age) {   // Constructor
        this.nome=name;
        this.peso=weight;
        this.altura=height;
        this.idade=age;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;    
    }

    public float getAltura() {
        return altura;
    }

    public float getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
}
