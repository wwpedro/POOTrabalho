import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class AutenticacaoUsuario {
        public static void main(String[] args) throws SQLException, IOException {
            while(true) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("** Bem vindo ao Workbench para fazer modificacões é necessário fazer login: **\n" +
                        "Digite uma opcao:\n" +
                        "1- Realizar login\n" +
                        "2- Encerrar programa\n");

                int opcao = entrada.nextInt();

                if (opcao == 1) {
                    Scanner entradalogin = new Scanner(System.in);
                    System.out.println("Digite o login:");
                    String login = entradalogin.nextLine();
                    Scanner entradasenha = new Scanner(System.in);
                    System.out.println("Digite a senha:");
                    String senha = entradasenha.nextLine();
                    ConexaoBanco autenticar = new ConexaoBanco();
                    if (autenticar.consultarUsuario(login,senha) == true){
                        System.out.println("Acesso Autorizado.");
                        MenuEstoque menu = new MenuEstoque();
                        menu.estoque_menu();
                        break;
                    }
                    else{

                        System.out.println("Acesso negado, usuário ou senha incorreto.");
                    }


                } else if (opcao == 2) {
                    break;
                }
                else {
                    System.out.println("Opcao invalida.");
                }



            }
        }
    }



