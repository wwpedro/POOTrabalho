package Model;

public class Condimentos extends Produto {
    
	private int qtdConservantes;
	
	

	public Condimentos(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras, int qtdConservantes) {
		super(validade, peso, preco, marca, descricao, tipo, codigodebarras);
		this.qtdConservantes = qtdConservantes;
	}

	public Condimentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condimentos(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras) {
		super(validade, peso, preco, marca, descricao, tipo, codigodebarras);
		// TODO Auto-generated constructor stub
	}

	public int getQtdConservantes() {
		return qtdConservantes;
	}

	public void setQtdConservantes(int qtdConservantes) {
		this.qtdConservantes = qtdConservantes;
	}

    

    
}
