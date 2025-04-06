package classes;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Carne", 0.150);
        Comida c2 = new Comida("Arroz", 0.200);

        Pessoa p = new Pessoa("joao", 89.0);

        System.out.println(p.apresentar());
        p.comer(c1);
        System.out.println(p.apresentar());
        p.comer(c2);
        System.out.println(p.apresentar());
    }
}
