

public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int paginasColoridas, boolean frenteEVerso){

        Impressao impressao = new Impressao();

        impressao.setPaginasColoridas(paginasColoridas);
        impressao.setPaginasTotais(totalPaginas);
        impressao.setEhFrenteVerso(frenteEVerso);

        if(tamanhoImpressao.equals(TamanhoImpressao.A2) && !frenteEVerso){ //A2 false
            impressao.setValorPretoBrancoFrenteApenas(0.22);
            impressao.setValorColoridasFrenteApenas(0.32);
            impressao.calcularTotal();
        }

        if(tamanhoImpressao.equals(TamanhoImpressao.A2) && frenteEVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.18);
            impressao.setValorColoridasFrenteVerso(0.28);
            impressao.calcularTotal();
        }

        if(tamanhoImpressao.equals(TamanhoImpressao.A3) && !frenteEVerso){ //A3 false
            impressao.setValorPretoBrancoFrenteApenas(0.20);
            impressao.setValorColoridasFrenteApenas(0.30);
            impressao.calcularTotal();
        }

        if(tamanhoImpressao.equals(TamanhoImpressao.A3) && frenteEVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.15);
            impressao.setValorColoridasFrenteVerso(0.25);
            impressao.calcularTotal();
        }

        if(tamanhoImpressao.equals(TamanhoImpressao.A4) && !frenteEVerso){ //A4 false
            impressao.setValorPretoBrancoFrenteApenas(0.15);
            impressao.setValorColoridasFrenteApenas(0.25);
            impressao.calcularTotal();
        }

        if(tamanhoImpressao.equals(TamanhoImpressao.A4) && frenteEVerso){
            impressao.setValorPretoBrancoFrenteVerso(0.10);
            impressao.setValorColoridasFrenteVerso(0.20);
            impressao.calcularTotal();
        }
        return impressao;
    }
}
