package Model;

public class Limpeza extends Produto{
    private String toxicidade;

    
   

	public Limpeza(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras, String toxicidade) {
		super(validade, peso, preco, marca, descricao, tipo, codigodebarras);
		this.toxicidade = toxicidade;
	}

	public Limpeza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setToxicidade(String toxicidade) {
        this.toxicidade = toxicidade;

    }

    public String getToxicidade() {
        return toxicidade;
    }
}
