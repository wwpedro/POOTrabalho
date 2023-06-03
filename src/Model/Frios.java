package Model;

public class Frios extends Produto {
    private double temperaturaCeucius;

    
	public Frios(String validade, double peso, double preco, String marca, String descricao, String tipo,
			int codigodebarras, double temperaturaCeucius) {
		super(validade, peso, preco, marca, descricao, tipo, codigodebarras);
		this.temperaturaCeucius = temperaturaCeucius;
	}

	public Frios() {
		super();
	}

	public double getTemperaturaCeucius() {
		return temperaturaCeucius;
	}

	public void setTemperaturaCeucius(double temperaturaCeucius) {
		this.temperaturaCeucius = temperaturaCeucius;
	}

	
	
}
