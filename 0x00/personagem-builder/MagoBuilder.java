

public class MagoBuilder implements personagem.Builder {

    private String nome;
    private personagem.TipoPersonagem tipoPersonagem;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public personagem.Mago build(){
        return new personagem.Mago(nome, inteligencia, forca, vigor, resistencia, destreza);
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipoPersonagem(personagem.TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }
}
