

import java.util.*;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensForaCaixa = new HashSet<ItemPedido>();
        this.itensDentroCaixa = new HashSet<ItemPedido>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public void setItensDentroCaixa(HashSet<ItemPedido> itensDentroCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void setItensForaCaixa(HashSet<ItemPedido> itensForaCaixa) {
        this.itensForaCaixa = itensForaCaixa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pedido pedido = (Pedido) o;

        if (itensDentroCaixa != null ? !itensDentroCaixa.equals(pedido.itensDentroCaixa) : pedido.itensDentroCaixa != null)
            return false;
        return itensForaCaixa != null ? itensForaCaixa.equals(pedido.itensForaCaixa) : pedido.itensForaCaixa == null;
    }

    @Override
    public int hashCode() {
        int result = itensDentroCaixa != null ? itensDentroCaixa.hashCode() : 0;
        result = 31 * result + (itensForaCaixa != null ? itensForaCaixa.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        //Iterator<ItemPedido> iD = itensDentroCaixa.iterator();
        String dados = "";
        //while(iD.hasNext()) {
        for (ItemPedido itemPedido : this.itensDentroCaixa) {
            dados = dados + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() +"\n" ;
        }
            //ItemPedido itemPedidoD = iD.next();

        Iterator<ItemPedido> iF = itensForaCaixa.iterator();
        String fora = "";
        while(iF.hasNext()) {
            ItemPedido itemPedido = iF.next();
            fora = fora + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() +"\n";
        }
        return String.format("\tFora da Caixa:\n%s" +
                "\tDentro da Caixa:\n%s", fora, dados);
    }
}
