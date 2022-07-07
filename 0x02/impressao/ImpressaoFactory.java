

public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanho, int totalPaginas, int quantidadeColoridas, boolean ehFrenteVerso){

        Impressao impressao = new Impressao();

        impressao.setPaginasColoridas(quantidadeColoridas);
        impressao.setPaginasTotais(totalPaginas);
        impressao.setEhFrenteVerso(ehFrenteVerso);

        if(tamanho.equals(TamanhoImpressao.A2) && !ehFrenteVerso){ //A2 false
            impressao.setValorPretoBrancoFrenteApenas(0.22);
            impressao.setValorColoridasFrenteApenas(0.32);
            impressao.calcularTotal();
        }

        if(tamanho.equals(TamanhoImpressao.A2) && ehFrenteVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.18);
            impressao.setValorColoridasFrenteVerso(0.28);
            impressao.calcularTotal();
        }

        if(tamanho.equals(TamanhoImpressao.A3) && !ehFrenteVerso){ //A3 false
            impressao.setValorPretoBrancoFrenteApenas(0.20);
            impressao.setValorColoridasFrenteApenas(0.30);
            impressao.calcularTotal();
        }

        if(tamanho.equals(TamanhoImpressao.A3) && ehFrenteVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.15);
            impressao.setValorColoridasFrenteVerso(0.25);
            impressao.calcularTotal();
        }

        if(tamanho.equals(TamanhoImpressao.A4) && !ehFrenteVerso){ //A4 false
            impressao.setValorPretoBrancoFrenteApenas(0.15);
            impressao.setValorColoridasFrenteApenas(0.25);
            impressao.calcularTotal();
        }

        if(tamanho.equals(TamanhoImpressao.A4) && ehFrenteVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.10);
            impressao.setValorColoridasFrenteVerso(0.20);
            impressao.calcularTotal();
        }
        return impressao;
    }
}
