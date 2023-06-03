package View;
import java.sql.SQLException;
import java.util.Scanner;

import Controller.Estoque;
import Model.ExcluirDados;

public class MenuEstoque {
    public void estoque_menu() throws SQLException{
        while(true) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("** Estoque Workbenck **\n" +
                    "Digite uma opcao:\n" +
                    "1- Cadastrar produto\n" +
                    "2- Consultar estoque\n" +
                    "3- Excluir um produto\n" +
                    "4- Encerrar programa");

            int opcao = entrada.nextInt();

            if (opcao == 1) {
                Estoque produto = new Estoque();
                produto.cadastrarProduto();
            } else if (opcao == 2) {
                Estoque estoque = new Estoque();
                estoque .consultarEstoque();
            } else if (opcao == 3) {
                ExcluirDados excluir = new ExcluirDados();
                excluir.excluir();
            } else if (opcao == 4){
                break;
            }else {
                System.out.println("Opcao invalida.");
            }



        }
    }
}