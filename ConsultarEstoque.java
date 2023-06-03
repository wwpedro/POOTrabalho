import java.sql.SQLException;

public class ConsultarEstoque{

    public void consultar() throws SQLException {
        ConexaoBanco consultardados = new ConexaoBanco();
        consultardados.receber_dados();
    }
}
