

import java.util.UUID;

public class CalculadorSalarioService {

    static CalculadorSalarioService instancia;

    public UUID uuid = UUID.randomUUID();
    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if(instancia == null){
           instancia = new CalculadorSalarioService();
           return instancia;
        }
        return instancia;
    }

    public double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

    public static CalculadorSalarioService getInstancia() {
        return instancia;
    }

    public static void setInstancia(CalculadorSalarioService instancia) {
        CalculadorSalarioService.instancia = instancia;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
