package Model;

public class Produto {
	
	    private int ID;
	    private String nome;
	    private float preco;
	    private String tipo;
	    protected float temperatura;
		
	    
	    public Produto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Produto(int ID, String nome, float preco) {
			super();
			this.ID = ID;
			this.nome = nome;
			this.preco = preco;
		}
		
		
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public double getTemperatura() {
			return temperatura;
		}
		public void setTemperatura(float temperatura) {
			this.temperatura = temperatura;
		}
		
	    

	}







