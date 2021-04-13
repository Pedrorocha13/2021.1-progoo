public class Conta {
    // Atributos
    int numero;
    Cliente titular;
    double saldo;

    public Conta(int numero, Cliente titular) {
        this.saldo = 0;
        this.numero = numero;
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

    String informarDadosConta() {
        String mensagem;

        mensagem = "Conta n. " + this.numero + "\n";
        mensagem += "Titular: " + this.titular.infoCliente() + "\n";
        mensagem += "Saldo atual: R$" + this.saldo;

        return mensagem;
    }

    double consultarSaldo() {
        return this.saldo;
    }
}
