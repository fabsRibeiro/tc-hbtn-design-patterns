
import java.util.List;

public abstract class Bebida {


    abstract List<String> obterIngredientes();

    abstract double obterPreco();

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }
}
