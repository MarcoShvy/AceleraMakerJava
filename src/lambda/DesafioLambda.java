package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3212.20,0.13);

        Function<Produto, Double> precoFinal = null;
        UnaryOperator<Double> impostoMunicial = null;
        UnaryOperator<Double> frete = null;
        UnaryOperator<Double> arrendodar = null;
        Function<Double, String> formatar = null;

        String preco = precoFinal
                .andThen(impostoMunicial)
                .andThen(frete)
                .andThen(arrendodar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " + preco);
    }
}
