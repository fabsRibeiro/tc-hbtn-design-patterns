

import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> ingredientes = bebidaDecorada.obterIngredientes();
        ingredientes.add("acucar");
        return ingredientes;
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco() + 1.9;
    }
}
