package Model;

public class Frios extends Produto {


	public Frios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frios(int ID, String nome, float preco) {
		super(ID, nome, preco);
		// TODO Auto-generated constructor stub
	}

	public void setTemperatura(float temperatura) {
        super.setTemperatura(temperatura);
    }

    public double getTemperatura() {
        return super.getTemperatura();
    }

	
	
}
