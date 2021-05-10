package br.ibmec.progoo.aplicacoes;

import java.util.ArrayList;

import br.ibmec.progoo.entidades.Cliente;

public class Lista {
    public void aplicacaoArrayList() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("123", "fulano", "de tal");

        listaClientes.add(cliente1);
        listaClientes.add(new Cliente("456", "beltrano", "de tal"));

        System.out.println(listaClientes.size());

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente.toString());
        }

        System.out.println(listaClientes.indexOf(cliente1));

        System.out.println(listaClientes.contains(cliente1));
        System.out.println(listaClientes.contains(new Cliente("123", "fulano", "de tal")));

        listaClientes.remove(cliente1);
        listaClientes.remove(0);
        System.out.println(listaClientes.size());
    }
}
