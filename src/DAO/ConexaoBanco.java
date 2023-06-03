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
                String sql = "INSERT INTO produtos (codigo_de_barras, validade, peso_g, preco, marca, descricao, tipo, toxicidade, dano, temperatura, quantidade_conservantes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = dados.conectar().prepareStatement(sql);
                stmt.setInt(1, Produtos.getCodigodebarras());
                stmt.setString(2, Produtos.getValidade());
                stmt.setDouble(3, Produtos.getPeso());
                stmt.setDouble(4, Produtos.getPreco());
                stmt.setString(5, Produtos.getMarca());
                stmt.setString(6, Produtos.getDescricao());
                stmt.setString(7, Produtos.getTipo());
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
                        int codigo_de_barras = rs.getInt("codigo_de_barras");
                        String validade = rs.getString("validade");
                        double peso = rs.getDouble("peso_g");
                        double preco = rs.getDouble("preco");
                        String marca = rs.getString("marca");
                        String descricao = rs.getString("descricao");
                        String tipo = rs.getString("tipo");
                        String toxicidade = rs.getString("toxicidade");
                        String dano = rs.getString("dano");
                        double temperatura = rs.getDouble("temperatura");
                        int conservantes = rs.getInt("quantidade_conservantes");

                        System.out.println(qnt_produtos + "- Produto");
                        System.out.println("Dados Recebidos do banco de dados:");
                        System.out.println("Codigo de Barras: " + codigo_de_barras);
                        System.out.println("Validade: " + validade);
                        System.out.println("Peso: " + peso);
                        System.out.println("Preco: " + preco);
                        System.out.println("Marca: " + marca);
                        System.out.println("Descricao: " + descricao);
                        System.out.println("Tipo: " + tipo);
                        System.out.println("Toxicidade: " + toxicidade);
                        System.out.println("Dano: " + dano);
                        System.out.println("Temperatura: " + temperatura);
                        System.out.println("Conservantes: " + conservantes + "\n");
                }
        }

        public void deletar_dados(int codigoDeBarras) throws SQLException {
                dados.conectar();
                String sql = "DELETE FROM produtos WHERE codigo_de_barras = ?";
                PreparedStatement stmt = dados.conectar().prepareStatement(sql);
                stmt.setInt(1, codigoDeBarras);
                int rowsDeleted = stmt.executeUpdate();

                if (rowsDeleted > 0) {
                        System.out.println("Registro excluido da tabela.");
                } else {
                        System.out.println("Nenhum registro encontrado na tabela com o codigo de barras " + codigoDeBarras + ".");
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
