package br.ibmec.progoo.persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ibmec.progoo.entidades.Cliente;
import br.ibmec.progoo.util.Arquivo;

public class ClienteDB {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void adicionar(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public static void alterar(Cliente cliente) {
        int posicao = clientes.indexOf(cliente);
        clientes.set(posicao, cliente);
    }

    public static void excluir(Cliente cliente) {
        clientes.remove(cliente);
    }

    public static List<Cliente> listar() {
        return Collections.unmodifiableList(clientes);
    }

    public static void exportar(String nomeArquivo) throws IOException {
        List<String> linhas = new ArrayList<>();

        for (Cliente cliente : ClienteDB.listar()) {
            linhas.add(cliente.toString());
        }

        Arquivo.escrever(nomeArquivo, linhas);
    }

     public static void importar(String nomeArquivo) throws IOException {
         List<String> linhas = Arquivo.ler(nomeArquivo);

         for (String linha : linhas) {
             String[] dadosCliente = linha.split(",");
             ClienteDB.adicionar(new Cliente(dadosCliente[0], dadosCliente[1], dadosCliente[2]));
         }
     }
}
