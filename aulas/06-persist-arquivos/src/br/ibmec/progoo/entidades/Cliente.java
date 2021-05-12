package br.ibmec.progoo.entidades;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import br.ibmec.progoo.persistencia.ClienteDB;

public class Cliente {
    private String cpf;
    private String nome;
    private String sobrenome;

    public Cliente(String cpf) {
        this.cpf = cpf;
        this.nome = "";
        this.sobrenome = "";
    }

    public Cliente(String cpf, String nome, String sobrenome) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void cadastrar() {
        ClienteDB.adicionar(this);
    }

    public void alterar() {
        ClienteDB.alterar(this);
    }

    public void excluir() {
        ClienteDB.excluir(this);
    }

    public Cliente consultar() {
        List<Cliente> clientes = ClienteDB.listar();

        for (Cliente cliente : clientes) {
            if (cliente.equals(this)) {
                return cliente;
            }
        }

        return null;
    }

    public static void exibirTodos() {
        for (Cliente cliente : ClienteDB.listar()) {
            System.out.println(cliente);
        }
    }

    public static void exportar(String nomeArquivo) throws IOException {
        ClienteDB.exportar(nomeArquivo);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, sobrenome);
    }

    @Override
    public String toString() {
        return this.cpf + " - " + this.nome + " " + this.sobrenome;
    }
}
