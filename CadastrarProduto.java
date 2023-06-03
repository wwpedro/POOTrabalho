import java.sql.SQLException;
import java.util.Scanner;

public class CadastrarProduto {
    public void cadastrar() throws SQLException {
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
            Frios frios = new Frios(dataValidade, peso, preco, marca, descricao, codigoBarras);
            frios.setTemperatura1(temperatura);
            frios.setTipo("Frios");
            enviarDados.cadastrar_dados(frios);

        } else if (escolhaProduto.equals("2") || escolhaProduto.equals("limpeza")) {
            System.out.println("O produto é tóxico? (SIM ou NÃO)");
            String toxico = entrada.nextLine().toUpperCase();
            Limpeza limpeza = new Limpeza(dataValidade, peso, preco, marca, descricao, codigoBarras);
            limpeza.setToxicidade(toxico);
            limpeza.setTipo("Limpeza");
            enviarDados.cadastrar_dados(limpeza);

        } else if (escolhaProduto.equals("3") || escolhaProduto.equals("condimento") || escolhaProduto.equals("condimentos")) {
            System.out.println("O produto tem quantos conservantes?");
            int conservantes = entrada.nextInt();
            Condimentos condimentos = new Condimentos(dataValidade, peso, preco, marca, descricao, codigoBarras);
            condimentos.setQtdConservantes(conservantes);
            condimentos.setTipo("Condimentos");
            enviarDados.cadastrar_dados(condimentos);

        } else if (escolhaProduto.equals("4") || escolhaProduto.equals("não perecível")) {
            NaoPereciveis naoPereciveis = new NaoPereciveis(dataValidade, peso, preco, marca, descricao, codigoBarras);
            naoPereciveis.setTipo("Não Perecível");
            enviarDados.cadastrar_dados(naoPereciveis);

        } else if (escolhaProduto.equals("5") || escolhaProduto.equals("higiene")) {
            System.out.println("O produto causa algum dano? (SIM ou NÃO)");
            String dano = entrada.nextLine().toUpperCase();
            Higiene higiene = new Higiene(dataValidade, peso, preco, marca, descricao, codigoBarras);
            higiene.setDano(dano);
            higiene.setTipo("Higiene");
            enviarDados.cadastrar_dados(higiene);
        }

    }
}