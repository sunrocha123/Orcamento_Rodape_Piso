public class Orcamento {
    private int nro;
    private Piso piso;
    private Rodape rodape;
    private float total;

    public Orcamento(){}

    public void setNro(int nro){
        this.nro = nro;
    }

    public void setPiso(Piso piso){
        this.piso = piso;
    }

    public void setRodape(Rodape rodape){
        this.rodape = rodape;
    }

    public void setTotal(float t){
        this.total = t;
    }

    public int getNro(){
        return this.nro;
    }

    public Piso getPiso(){
        return this.piso;
    }

    public Rodape getRodape(){
        return this.rodape;
    }

    public float getTotal(){
        return this.total;
    }

    public String emissaoPagamento(){
        String visaoRodape;
        String visaoPiso;

        visaoPiso = piso.visualizar();
        visaoRodape = rodape.visualizar();

        calculaTotal();
        return "\n\nNúmero do orçamento: " + getNro() + visaoRodape + visaoPiso + "\nTotal: R$ " + (getTotal() + ((getTotal() * 5)/100)) + "\n";
    }

    public void calculaTotal(){
        float valorRodape;
        float valorPiso;

        valorRodape = rodape.getValor();
        valorPiso = piso.getValor();
        setTotal(valorPiso + valorRodape);
    }
}
