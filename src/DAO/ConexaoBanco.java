package DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Produto;

import java.sql.ResultSet;

public class ConexaoBanco {
    DadosConexao dados = new DadosConexao();
    DadosConexaoAutenticacao dadosautenticacao = new DadosConexaoAutenticacao();

    public void cadastrar_dados(Produto Produtos) throws SQLException {
            dados.conectar();
            String sql = "INSERT INTO produtos (id,nome, preco, tipo, temperatura) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = dados.conectar().prepareStatement(sql);
            stmt.setDouble(1, Produtos.getID());
            stmt.setString(2, Produtos.getNome());
            stmt.setDouble(3, Produtos.getPreco());
            stmt.setString(4, Produtos.getTipo());
            stmt.setDouble(5, Produtos.getTemperatura());
            stmt.execute();

            System.out.println("Dados Cadastrados ao banco de dados.");
    }

    public void receber_dados() throws SQLException {
            dados.conectar();
            String sql = "SELECT * FROM produtos";
            PreparedStatement stmt = dados.conectar().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int qnt_produtos = 0;
            while (rs.next()) {
                    qnt_produtos += 1;
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    double preco = rs.getDouble("preco");
                    String tipo = rs.getString("tipo");
                    double temperatura = rs.getDouble("temperatura");

                    System.out.println(qnt_produtos + "- Produto");
                    System.out.println("Dados Recebidos do banco de dados:");
                    System.out.println("Codigo de Barras: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Preco: " + preco);
                    System.out.println("Tipo: " + tipo);
                    System.out.println("Temperatura: " + temperatura);
            }
    }

    public void deletar_dados(int id) throws SQLException {
            dados.conectar();
            String sql = "DELETE FROM produtos WHERE id = ?";
            PreparedStatement stmt = dados.conectar().prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                    System.out.println("Registro excluido da tabela.");
            } else {
                    System.out.println("Nenhum registro encontrado na tabela com o codigo " + id + ".");
            }
    }

    public boolean consultarUsuario(String loginUsuario, String loginSenha) throws SQLException {
            dadosautenticacao.conectar();
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = dadosautenticacao.conectar().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                    String usuario = rs.getString("usuario");
                    String senha = rs.getString("senha");
                    if (loginUsuario.equals(usuario) && loginSenha.equals(senha)) {
                            return true;
                    }
            }
            return false;
    }
}
