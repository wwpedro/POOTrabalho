public class Higiene extends Produtos{
    private String dano;

    public Higiene(String validade,Double peso,double preco,String marca,String descricao,int codigodebarras){
        super(validade,peso,preco,marca,descricao,codigodebarras);

    }
    void setDano(String dano){
       super.dano1 = dano;

    }

    public String getDano() {
        return super.dano1;
    }
}
