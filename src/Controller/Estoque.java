package Controller;
import java.util.Locale;
import java.sql.SQLException;
import java.util.Scanner;

import DAO.ConexaoBanco;
import Model.Frios;
import Model.NaoPereciveis;
import java.util.Locale;
public class Estoque implements EstoqueInterface{
	
	
	public void cadastrarProduto() throws SQLException {
    ConexaoBanco enviarDados = new ConexaoBanco();
    Scanner entrada = new Scanner(System.in);

    System.out.println("**** CADASTRO DE PRODUTOS ****");

    System.out.println("1- Digite o código do produto.");
    int id = entrada.nextInt();

    entrada.nextLine(); 

    System.out.println("2- Digite o nome do produto");
    String nome = entrada.nextLine();

    System.out.println("3- Digite o preço do produto.");
    entrada.useLocale(Locale.US);
    float preco = entrada.nextFloat();

    entrada.nextLine(); 

    System.out.println("O produto é do tipo:");
    System.out.println("1- Frios");
    System.out.println("2- Não perecível");

    String escolhaProduto = entrada.nextLine().toLowerCase();

    if (escolhaProduto.equals("1") || escolhaProduto.equals("frios")) {
        System.out.println("Qual a temperatura ideal do produto (em graus Celsius)?");
        float temperaturaFrios = entrada.nextFloat();
        entrada.nextLine(); 
        Frios frios = new Frios(id, nome, preco);
        frios.setTipo("Frios");
        frios.setTemperatura(temperaturaFrios);
        enviarDados.cadastrar_dados(frios);

    } else if (escolhaProduto.equals("2") || escolhaProduto.equals("não perecível")) {
        NaoPereciveis naoPereciveis = new NaoPereciveis(id, nome, preco);
        naoPereciveis.setTipo("Não Perecivel");
        enviarDados.cadastrar_dados(naoPereciveis);

    } else {
        System.out.println("Produto inválido.");
    }

}

	public void consultarEstoque() throws SQLException {
        ConexaoBanco consultardados = new ConexaoBanco();
        consultardados.receber_dados();
    }

	public void excluirProduto() throws SQLException {
        ConexaoBanco deletardados = new ConexaoBanco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("** Para deletar um produto e necessario fornecer o codigo de barras **\n" +
                "Qual o codigo de barras do produto?");
        int codigo = entrada.nextInt();
        deletardados.deletar_dados(codigo);
    }
	public void alterarProduto() throws SQLException {
	    ConexaoBanco alterardados = new ConexaoBanco();
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("** MENU **");
	    System.out.println("1. Alterar Preço");
	    System.out.println("2. Alterar Nome");
	    int opcao = entrada.nextInt();
	    entrada.nextLine();
	    System.out.println("Digite o código de barras do produto.");
	    int codigo = entrada.nextInt();
	    entrada.nextLine();
	    if (opcao == 1) {
	        System.out.println("Digite o novo preço do produto.");
	        entrada.useLocale(Locale.US);
	        float preco = entrada.nextFloat();
	        alterardados.atualizarPreco(codigo, preco);
	    } else if (opcao == 2) {
	        System.out.println("Digite o novo nome do produto.");
	        String nome = entrada.nextLine();
	        alterardados.atualizarNome(codigo, nome);
	    }
	}

    	
}

