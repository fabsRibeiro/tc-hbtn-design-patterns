

import java.util.*;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensForaCaixa = new HashSet<>();
        this.itensDentroCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {

        Iterator<ItemPedido> iD = itensDentroCaixa.iterator();
        String dados = "";
        while(iD.hasNext()) {
            ItemPedido itemPedidoD = (ItemPedido)iD.next();
            dados = "        - " + itemPedidoD.getTipo() + " " + itemPedidoD.getNome() +"\n" + dados;
        }

        Iterator<ItemPedido> iF = itensForaCaixa.iterator();
        String fora = "";
        while(iF.hasNext()) {
            ItemPedido itemPedido = (ItemPedido)iF.next();
            fora = "        - " + itemPedido.getTipo() + " " + itemPedido.getNome();
        }
        return String.format("Fora da caixa:\n" + fora +
                "\nDentro da Caixa: \n" + dados);
    }
}
