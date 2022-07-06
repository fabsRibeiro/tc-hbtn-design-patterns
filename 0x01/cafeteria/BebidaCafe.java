
import java.util.List;

public class BebidaCafe extends Bebida{

    @Override
    List<String> obterIngredientes() {
            List<String> ingredientes = new ArrayList<>();
            ingredientes.add("cafe");
            return ingredientes;
    }

    @Override
    double obterPreco() {
        return 5.35;
    }
}
