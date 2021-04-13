public class Agencia {

    // Um array é sempre um objeto, então o atributo é uma referência
    Conta[] contas;
    int contasArmazenadas;

    public Agencia(int capacidadeAgencia) {
        this.contas = new Conta[capacidadeAgencia];
        this.contasArmazenadas = 0;
    }

    public Conta criarConta(int numero, Cliente titular) {
        Conta novaConta = new Conta(numero, titular);
        this.contas[this.contasArmazenadas] = novaConta;
        this.contasArmazenadas += 1;

        return novaConta;
    }

    public void exibirSaldos() {
        if ( this.contas[0] != null ) {
            // Enhanced for, ou for melhorado
            for ( Conta conta : this.contas ) {
                if ( conta == null ) {
                    break;
                }
                System.out.println("Conta " + conta.numero + " - " + conta.consultarSaldo());
            }
        }
    }

    public void expandir(int novaCapacidade) {
        // Em Java, um array não pode mudar de tamanho!
        // Caso precise aumentar o tamanho de um array, é necessário criar um
        // array novo e transferir os dados do anterior para o novo

        /*
        for ( int i = 0; i < this.contasArmazenadas; i++ ) {
            <código>
        }
        */
    }
}
