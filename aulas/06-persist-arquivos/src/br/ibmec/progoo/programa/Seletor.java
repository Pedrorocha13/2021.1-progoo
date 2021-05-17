package br.ibmec.progoo.programa;

import java.io.IOException;

import br.ibmec.progoo.entidades.Cliente;
import br.ibmec.progoo.util.LeitoraDados;

/**
 * Classe para operar a seleção do usuário.
 */
public class Seletor {
    private LeitoraDados leitoraDados;

    /**
     * Construtor vazio. Inicia uma leitora de dados.
     */
    public Seletor() {
        this.leitoraDados = new LeitoraDados();
    }

    /**
     * Exibe as opções do programa.
     */
    public void exibeOpcoes() {
        System.out.println("Selecione um número, ou aperte qualquer outro valor para sair:");
        System.out.println("1 - Cadastrar um cliente;");
        System.out.println("2 - Atualizar um cliente;");
        System.out.println("3 - Remover um cliente;");
        System.out.println("4 - Pesquisar um cliente pelo CPF;");
        System.out.println("5 - Exibir todos os clientes cadastrados;");
        System.out.println("6 - Salvar clientes em um arquivo de texto;");
        System.out.println("7 - Ler clientes de um arquivo de texto.");
    }

    /**
     * Processa a opção dada pelo usuário, e realiza ação conforme necessário.
     *
     * @param opcao         Uma string dada pelo usuário, representando alguma opção válida do programa.
     * @return              A opção selecionada, ou uma string vazia caso a opção tenha sido inválida.
     * @throws IOException  Caso ocorra um erro na leitura ou escrita de um arquivo.
     */
    public String processaOpcoes(String opcao) throws IOException {
        switch(opcao) {
            case "1":
                Cliente novoCliente = leitoraDados.lerNovoCliente();
                novoCliente.cadastrar();
                break;
            case "2":
                System.out.println("Digite o CPF do cliente a ser alterado: ");
                String cpfAlterar = leitoraDados.lerTexto();

                Cliente clienteAlterado = leitoraDados.lerClienteAlteracao(cpfAlterar);
                clienteAlterado.alterar();
                break;
            case "3":
                System.out.println("Digite o CPF do cliente a ser excluído: ");
                String cpfExcluir = leitoraDados.lerTexto();

                Cliente clienteExcluir = new Cliente(cpfExcluir).consultar();
                clienteExcluir.excluir();
                break;
            case "4":
                System.out.println("Digite o CPF do cliente: ");
                String cpf = leitoraDados.lerTexto();

                Cliente clienteConsultado = new Cliente(cpf).consultar();
                System.out.println(clienteConsultado);
                break;
            case "5":
                Cliente.exibirTodos();
                break;
            case "6":
                System.out.print("Informe o nome do arquivo para salvar: ");
                String caminhoExportar = leitoraDados.lerTexto();

                Cliente.exportar(caminhoExportar);
                break;
            case "7":
                System.out.print("Informe o nome do arquivo para ler: ");
                String caminhoImportar = leitoraDados.lerTexto();

                Cliente.importar(caminhoImportar);
                break;
            default:
                System.out.println("Volte sempre!");
                opcao = "";
        }

        return opcao;
    }
}
