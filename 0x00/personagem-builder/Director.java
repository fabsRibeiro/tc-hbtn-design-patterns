

public class Director {

    void buildGuerreiro(personagem.Builder builder){
        builder.setNome("Guerreiro");
        builder.setTipoPersonagem(personagem.TipoPersonagem.GUERREIRO);
        builder.setInteligencia(1);
        builder.setForca(8);
        builder.setDestreza(6);
        builder.setVigor(5);
        builder.setResistencia(10);
    }

    void buildLadrao(personagem.Builder builder){
        builder.setNome("Ladrão");
        builder.setTipoPersonagem(personagem.TipoPersonagem.LADRAO);
        builder.setInteligencia(2);
        builder.setForca(6);
        builder.setDestreza(10);
        builder.setVigor(8);
        builder.setResistencia(5);
    }

    void buildMago(personagem.Builder builder){
        builder.setNome("Mago");
        builder.setTipoPersonagem(personagem.TipoPersonagem.MAGO);
        builder.setInteligencia(10);
        builder.setForca(2);
        builder.setDestreza(4);
        builder.setVigor(5);
        builder.setResistencia(3);
    }
}
