package Controller;

import java.sql.SQLException;
import java.util.Scanner;

import DAO.ConexaoBanco;
import Model.Condimentos;
import Model.Frios;
import Model.Higiene;
import Model.Limpeza;
import Model.NaoPereciveis;

public class Estoque {
	
	
	public void cadastrarProduto() throws SQLException {
        ConexaoBanco enviarDados = new ConexaoBanco();
        Scanner entrada = new Scanner(System.in);

        System.out.println("**** CADASTRO DE PRODUTOS ****");

        System.out.println("1- Digite o código de barras do produto.");
        int codigoBarras = entrada.nextInt();
        entrada.nextLine();

        System.out.println("2- Digite a validade do produto.");
        String dataValidade = entrada.nextLine();

        System.out.println("3- Digite o peso do produto (g)");
        Double peso = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("4- Digite a marca do produto.");
        String marca = entrada.nextLine();

        System.out.println("5- Digite a descrição do produto.");
        String descricao = entrada.nextLine();

        System.out.println("6- Digite o preço do produto.");
        Double preco = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("O produto é do tipo:");
        System.out.println("1- Frios");
        System.out.println("2- Limpeza");
        System.out.println("3- Condimento");
        System.out.println("4- Não perecível");
        System.out.println("5- Higiene");

        String escolhaProduto = entrada.nextLine().toLowerCase();

        if (escolhaProduto.equals("1") || escolhaProduto.equals("frios")) {
            System.out.println("Qual a temperatura ideal do produto (em graus Celsius)?");
            Double temperatura = entrada.nextDouble();
            Frios frios = new Frios(dataValidade, peso, preco, marca, descricao,"Frios", codigoBarras, temperatura);
            frios.setTemperaturaCeucius(temperatura);
            enviarDados.cadastrar_dados(frios, frios, null, null, null);

        } else if (escolhaProduto.equals("2") || escolhaProduto.equals("limpeza")) {
            System.out.println("O produto é tóxico? (SIM ou NÃO)");
            String toxico = entrada.nextLine().toUpperCase();
            Limpeza limpeza = new Limpeza(dataValidade, peso, preco, marca, descricao,"Limpeza",codigoBarras,toxico);
            limpeza.setToxicidade(toxico);
            enviarDados.cadastrar_dados(limpeza,null, limpeza, null, null);

        } else if (escolhaProduto.equals("3") || escolhaProduto.equals("condimento") || escolhaProduto.equals("condimentos")) {
            System.out.println("O produto tem quantos conservantes?");
            int conservantes = entrada.nextInt();
            Condimentos condimentos = new Condimentos(dataValidade, peso, preco, marca, descricao,"Condimentos", codigoBarras, conservantes);
            condimentos.setQtdConservantes(conservantes);
            enviarDados.cadastrar_dados(condimentos, null, null, null, condimentos);

        } else if (escolhaProduto.equals("4") || escolhaProduto.equals("não perecível")) {
            NaoPereciveis naoPereciveis = new NaoPereciveis(dataValidade, peso, preco, marca, descricao,"NaoPerecivel", codigoBarras);
            enviarDados.cadastrar_dados(naoPereciveis, null, null, null, null);

        } else if (escolhaProduto.equals("5") || escolhaProduto.equals("higiene")) {
            System.out.println("O produto causa algum dano? (SIM ou NÃO)");
            String dano = entrada.nextLine().toUpperCase();
            Higiene higiene = new Higiene(dataValidade, peso, preco, marca, descricao,"Higiene" ,codigoBarras,dano);
            higiene.setDano(dano);
            enviarDados.cadastrar_dados(higiene, null, null, higiene, null);
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
	
	public void enviarMercado() throws SQLException {
		excluirProduto();
		//pegar nome do mercado , exclui do banco e ver quantidade de produto que foi para o mercado
	}
	
}
