public class Conta {
    // Atributos
    int numero;
    Cliente titular;
    String agencia;
    double saldo;

    public Conta() {
        
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
