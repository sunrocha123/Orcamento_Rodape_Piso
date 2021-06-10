import java.util.Scanner;

public class Piso extends Produto{
    private String nome;
    private float metrosporcaixa;

    public Piso(String n, float mc, String m, float v){
        super(v, m);
        this.nome = n;
        this.metrosporcaixa = mc;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setMetrosporcaixa(float mc){
        this.metrosporcaixa = mc;
    }

    public String getNome(){
        return this.nome;
    }

    public float getMetrosporcaixa(){
        return this.metrosporcaixa;
    }

    public float calcularQtdeCaixas(float metro){
        return metro / this.metrosporcaixa;
    }

    @Override
    public float calcularValor(){

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a metragem do piso: ");
        float metro = input.nextFloat();
        setValor(calcularQtdeCaixas(metro) * getValor());
        
        return getValor();
  
    }

    public String visualizar(){
        return "\nMarca do Piso: " + getMarca() + "\nNome do Piso: " + getNome() + "\nMetros por caixa: " + getMetrosporcaixa() + "\nValor: R$" + calcularValor();
    }
}
