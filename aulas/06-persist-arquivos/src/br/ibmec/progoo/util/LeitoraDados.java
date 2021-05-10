package br.ibmec.progoo.util;

import java.util.Scanner;

import br.ibmec.progoo.entidades.Cliente;

public class LeitoraDados {
    private Scanner scanner;


    public LeitoraDados() {
        this.scanner = new Scanner(System.in);
    }

    public String lerTexto() {
        return scanner.nextLine();
    }

    public Cliente lerNovoCliente() {
        System.out.print("Informe o cpf: ");
        String cpf = this.lerTexto();

        System.out.print("Informe o nome: ");
        String nome = this.lerTexto();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = this.lerTexto();

        return new Cliente(cpf, nome, sobrenome);
    }

    public Cliente lerClienteAlteracao(String cpf) {
        System.out.print("Informe o nome: ");
        String nome = this.lerTexto();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = this.lerTexto();

        return new Cliente(cpf, nome, sobrenome);
    }

    @Override
    protected void finalize() {
        scanner.close();
    }
}
