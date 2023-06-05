package test;
import java.sql.SQLException;

import Controller.Estoque;


public class TesteEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        
        try {
            estoque.cadastrarProduto();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o produto: " + e.getMessage());
        }
    }
}

