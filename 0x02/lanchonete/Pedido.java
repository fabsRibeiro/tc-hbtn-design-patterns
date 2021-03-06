

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
        String cabecalhoForaDaCaixa = "\tFora da Caixa:\n";
        String cabecalhoDentroDaCaixa = "\tDentro da Caixa:\n";
        String itensForaDaCaixa = "";
        String itensDentroDaCaixa = "";
        int contator = this.itensDentroCaixa.size();

        for (ItemPedido itemPedido : this.itensForaCaixa) {
            itensForaDaCaixa = itensForaDaCaixa + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() + "\n";
        }

        while(contator != 0){
            for (ItemPedido itemPedido : this.itensDentroCaixa) {
                if(contator == this.itensDentroCaixa.size()){
                    if(itemPedido.getTipo().name() == "BRINDE" ){
                        itensDentroDaCaixa = itensDentroDaCaixa + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() + "\n";
                    }
                }
                if(contator == this.itensDentroCaixa.size()-1){
                    if(itemPedido.getTipo().name() == "BATATA" ){
                        itensDentroDaCaixa = itensDentroDaCaixa + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() + "\n";
                    }
                }
                if(contator == this.itensDentroCaixa.size()-2){
                    if(itemPedido.getTipo().name() == "LANCHE" ){
                        itensDentroDaCaixa = itensDentroDaCaixa + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() + "\n";
                    }
                }
            }
            contator--;
        }
        if(this.itensDentroCaixa.size() == 1) {
            for (ItemPedido itemPedido : this.itensDentroCaixa) {
                itensDentroDaCaixa = itensDentroDaCaixa + "\t\t- " + itemPedido.getTipo().name() + " " + itemPedido.getNome() + "\n";
            }
        }

        return (cabecalhoForaDaCaixa + itensForaDaCaixa + cabecalhoDentroDaCaixa + itensDentroDaCaixa);

    }
}
