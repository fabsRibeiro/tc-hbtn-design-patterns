

public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    private int totalPagImpressaoPretoEBanco;

    public Double calcularTotal(){
        totalPagImpressaoPretoEBanco = paginasTotais - paginasColoridas;
        double valorApagar = 0;

        if(ehFrenteVerso){
            valorApagar = (totalPagImpressaoPretoEBanco * valorPretoBrancoFrenteVerso)
                    + (paginasColoridas * valorColoridasFrenteVerso);
        } else {
            valorApagar = (totalPagImpressaoPretoEBanco * valorPretoBrancoFrenteApenas)
                    + (paginasColoridas * valorColoridasFrenteApenas);
        }
        return valorApagar;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    @Override
    public String toString() {

        if(valorPretoBrancoFrenteApenas != 0 || valorColoridasFrenteApenas != 0){
            return String.format("total de paginas: " + paginasTotais + ", " +
                    "total coloridas: " + paginasColoridas + ", " +
                    "total preto e branco: " + totalPagImpressaoPretoEBanco + "," +
                    " frente apenas. total: R$ %.2f", calcularTotal());
        }

        return String.format("total de paginas: " + paginasTotais + ", " +
                "total coloridas: " + paginasColoridas + ", " +
                "total preto e branco: " + totalPagImpressaoPretoEBanco + "," +
                " frente e verso. total: R$ %.2f", calcularTotal());
    }
}
