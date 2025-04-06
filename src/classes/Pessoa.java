package classes;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso) {
        this.peso = peso;
        this.nome = nome;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Eu sou o "+ this.nome + " e tenho "+ this.peso + "kg";
    }
}
