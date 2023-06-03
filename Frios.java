public class Frios extends Produtos {
    public Frios(String validade, double peso, double preco, String marca, String descricao, int codigodebarras){
        super(validade, peso, preco, marca, descricao, codigodebarras);
    }

    public void setTemperatura1(double temperatura) {
        super.setTemperatura1(temperatura);
    }

    public double getTemperatura1() {
        return super.getTemperatura1();
    }
}
