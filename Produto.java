public abstract class Produto {
    private String marca;
    private float valor;

    public Produto(float v, String m ){
        this.marca = m;
        this.valor = v;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public void setValor(float v){
        this.valor = v;
    }

    public String getMarca(){
        return this.marca;
    }

    public float getValor(){
        return this.valor;
    }

    public abstract String visualizar();
    public abstract float calcularValor();
}
