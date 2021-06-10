public class Rodape extends Produto {
    private String material;
    private float altura;

    public Rodape(String ma, float a, float va, String m){
        super(va, m);
        this.material = ma;
        this.altura = a;
    }

    public void setMaterial(String ma){
        this.material = ma;
    }

    public void setAltura(float a){
        this.altura = a;
    }

    public String getMaterial(){
        return this.material;
    }

    public float getAltura(){
        return this.altura;
    }

    public float calcularValor(){

        setValor(getValor() + ((getValor() * 15)/100));
        return getValor();
    }
    public String visualizar(){
        return "\nMarca Rodapé: " + getMarca() + "\nMaterial: " + getMaterial() + "\nAltura: " + getAltura() + "\nValor: R$" + calcularValor();
    }
}
