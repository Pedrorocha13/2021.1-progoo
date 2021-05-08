package br.ibmec.progoo.entidades;

public class Cliente {
    private String nome;
    private String sobrenome;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String infoCliente() {
        return this.nome + " " + this.sobrenome;
    }
}
