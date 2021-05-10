package br.ibmec.progoo.persistencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.ibmec.progoo.entidades.Cliente;

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
}
