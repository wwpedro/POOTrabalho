public class Produtos {
    private String validade;
    private double peso;
    private double preco;
    private String marca;
    private String descricao;
    private String tipo;

    protected double temperatura1;

    protected String dano1;

    protected String toxicidade1;

    protected int qntconservantes1;

    private int codigodebarras;



    public Produtos(String validade, double peso, double preco, String marca, String descricao, int codigodebarras) {
        this.validade = validade;
        this.peso = peso;
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
        this.codigodebarras = codigodebarras;

    }


    public String getValidade() {
        return validade;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigodebarras() {
        return codigodebarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCodigodebarras(int codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected void aumentar_preco(double valor_aumentado) {
        this.preco += valor_aumentado;
    }

    protected void diminuir_preco(double valor_diminuido) {
        this.preco -= valor_diminuido;

    }

    public void setToxicidade1(String toxico) {
        this.toxicidade1 = toxico;
    }

    public void setTemperatura1(double temperatura1) {
        this.temperatura1 = temperatura1;
    }

    public void setDano1(String dano1) {
        this.dano1 = dano1;
    }

    public void setQntconservantes1(int qntconservantes1) {
        this.qntconservantes1 = qntconservantes1;
    }

    public double getTemperatura1() {
        return temperatura1;
    }

    public int getQntconservantes1() {
        return qntconservantes1;
    }

    public String getDano1() {
        return dano1;
    }

    public String getToxicidade1() {
        return toxicidade1;
    }
}







