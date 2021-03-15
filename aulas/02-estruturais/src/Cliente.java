public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    String endereco;

    String infoCliente() {
        return this.cpf + " - " + this.nome + " " + this.sobrenome;
    }
}
