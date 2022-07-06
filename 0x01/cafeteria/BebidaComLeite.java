
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> ingredientes = bebidaDecorada.obterIngredientes();
        ingredientes.add("leite");
        return ingredientes;
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco() + 3.2;
    }
}
