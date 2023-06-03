package Model;

public class Produto {
    private String validade;
    private double peso;
    private double preco;
    private String marca;
    private String descricao;
    private String tipo;

    private int codigodebarras;

    


    public Produto(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras) {
		super();
		this.validade = validade;
		this.peso = peso;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.tipo = tipo;

		this.codigodebarras = codigodebarras;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
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
}







