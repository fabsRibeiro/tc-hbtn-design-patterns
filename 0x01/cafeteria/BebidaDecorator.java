
import java.util.List;

public class BebidaDecorator extends Bebida{

    Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}
