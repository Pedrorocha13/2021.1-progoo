public class Conta {
    // Atributos
    int numero;
    Cliente titular;
    String agencia;
    double saldo;

    public Conta() {
        this.saldo = 0;
        this.numero = 0;
        this.agencia = "Sem agência";
        this.titular = new Cliente();
    }

    public Conta(int numero, Cliente titular, String agencia) {
        this.saldo = 0;
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
    }

    void sacar(double quantidade) {
        this.saldo -= quantidade;
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    boolean estaUsandoLimite() {
        return this.saldo < 0;
    }

    void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    String exibeInfoConta() {
        String mensagem;

        mensagem = "Conta n. " + this.numero + "\n";
        mensagem += "Agencia: " + this.agencia + "\n";
        mensagem += "Titular: " + this.titular.infoCliente() + "\n";
        mensagem += "Saldo atual: R$" + this.saldo;

        return mensagem;
    }
}
