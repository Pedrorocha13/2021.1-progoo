package br.ibmec.progoo.aplicacoes;

import java.util.HashSet;

import br.ibmec.progoo.entidades.Cliente;

public class Conjunto {
    public void aplicacaoHashSet() {
        HashSet<Cliente> clientes = new HashSet<>();

        Cliente cliente1 = new Cliente("123", "fulano", "de tal");

        clientes.add(cliente1);
        clientes.add(new Cliente("456", "beltrano", "de tal"));
        clientes.add(new Cliente("789", "cicrano", "de tal"));
        clientes.add(cliente1);

        System.out.println(clientes.size());

        System.out.println(clientes.contains(cliente1));

        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }

        clientes.remove(cliente1);
        System.out.println(clientes.size());
    }
}
