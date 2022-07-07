

public class ItemPedido {

    private TipoItemPedido tipo;
    private String nome;

    public ItemPedido(TipoItemPedido tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemPedido that = (ItemPedido) o;

        if (tipo != that.tipo) return false;
        return nome != null ? nome.equals(that.nome) : that.nome == null;
    }

    @Override
    public int hashCode() {
        int result = tipo != null ? tipo.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }
}
