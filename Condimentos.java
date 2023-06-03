public class Condimentos extends Produtos {
    private int qtdConservantes;

    public Condimentos(String validade, double peso, double preco, String marca, String descricao, int codigoDeBarras) {
        super(validade, peso, preco, marca, descricao, codigoDeBarras);
    }

    public void setQtdConservantes(int conservantes) {
        super.qntconservantes1 = conservantes;
    }

    public int getQtdConservantes() {
        return super.qntconservantes1;
    }
}
