package br.ibmec.progoo.rodar;

import br.ibmec.progoo.entidades.Cliente;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Victor", "Machado");

        System.out.println(cliente.infoCliente());
    }
}
