public class Limpeza extends Produtos{
    private String toxicidade;

    public Limpeza(String validade,double peso,double preco,String marca,String descricao,int codigodebarras){
        super(validade,peso,preco,marca,descricao,codigodebarras);

    }
    public void setToxicidade(String toxicidade) {
        this.toxicidade = toxicidade;

    }

    public String getToxicidade() {
        return toxicidade;
    }
}
