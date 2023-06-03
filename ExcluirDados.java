import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirDados {

    public void excluir() throws SQLException {
        ConexaoBanco deletardados = new ConexaoBanco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("** Para deletar um produto e necessario fornecer o codigo de barras **\n" +
                "Qual o codigo de barras do produto?");
        int codigo = entrada.nextInt();
        deletardados.deletar_dados(codigo);
    }
}
