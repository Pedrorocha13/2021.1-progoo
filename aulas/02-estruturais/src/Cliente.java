public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    String endereco;

    public Cliente() {
        this.nome = "N/A";
        this.sobrenome = "N/A";
        this.cpf = "N/A";
        this.endereco = "N/A";
    }

    public Cliente(String nome, String sobrenome, String cpf, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    String infoCliente() {
        return this.cpf + " - " + this.nome + " " + this.sobrenome;
    }
}
