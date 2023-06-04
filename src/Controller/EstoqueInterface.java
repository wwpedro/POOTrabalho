package Controller;

import java.sql.SQLException;

public interface EstoqueInterface {
	
	public void cadastrarProduto() throws SQLException;
	public void consultarEstoque() throws SQLException;
	public void excluirProduto() throws SQLException;
}
