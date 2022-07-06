

public class Program {
    public static void main(String[] args) {
        personagem.Director director = new personagem.Director();

        personagem.GuerreiroBuilder guerreiroBuilder = new personagem.GuerreiroBuilder();
        director.buildGuerreiro(guerreiroBuilder);

        personagem.MagoBuilder magoBuilder = new personagem.MagoBuilder();
        director.buildMago(magoBuilder);

        personagem.LadraoBuilder ladraoBuilder = new personagem.LadraoBuilder();
        director.buildLadrao(ladraoBuilder);

        try {
            personagem.Mago mago = magoBuilder.build();
            System.out.println(mago);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            personagem.Ladrao ladrao = ladraoBuilder.build();
            System.out.println(ladrao);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            personagem.Guerreiro guerreiro = guerreiroBuilder.build();
            System.out.println(guerreiro);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
