import java.sql.SQLException;
import java.util.Scanner;

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
                CadastrarProduto cadastro = new CadastrarProduto();
                cadastro.cadastrar();
            } else if (opcao == 2) {
                ConsultarEstoque consultar = new ConsultarEstoque();
                consultar.consultar();
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
