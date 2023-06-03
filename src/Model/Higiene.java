package Model;

public class Higiene extends Produto{
    private String dano;
    
    

	


	public Higiene(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras, String dano) {
		super(validade, peso, preco, marca, descricao, tipo, codigodebarras);
		this.dano = dano;
	}


	public Higiene() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDano() {
		return dano;
	}


	public void setDano(String dano) {
		this.dano = dano;
	}


	

    
}
