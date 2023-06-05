package View;
import java.sql.SQLException;
import java.util.Scanner;

import Controller.Estoque;

public class MenuEstoque {
    public void estoque_menu() throws SQLException{
        while(true) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("** Estoque Workbenck **\n" +
                    "Digite uma opcao:\n" +
                    "1- Cadastrar produto\n" +
                    "2- Consultar estoque\n" +
                    "3- Excluir um produto\n" +
                    "4- Alterar produto\n" +
                    "5- Encerrar programa");

            int opcao = entrada.nextInt();
            Estoque estoque = new Estoque();
            
            if (opcao == 1) {
            	estoque.cadastrarProduto();
            } else if (opcao == 2) {
                estoque.consultarEstoque();
            } else if (opcao == 3) {
            	estoque.excluirProduto();
            }
            else if (opcao == 4) {
            	estoque.alterarProduto();
            }
            else if (opcao == 5){
                break;
            }
            else {
                System.out.println("Opcao invalida.");
            }
        }
    }
}
