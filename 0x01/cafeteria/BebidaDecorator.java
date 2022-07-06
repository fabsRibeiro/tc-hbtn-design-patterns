

import java.util.List;

public class BebidaDecorator extends Bebida{

    Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}
