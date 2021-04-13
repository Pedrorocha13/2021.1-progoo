import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a capacidade da agencia: ");
        int capacidade = input.nextInt();

        Agencia agencia = new Agencia(capacidade);

        System.out.println("Informacoes do cliente:");
        System.out.print("Nome: ");
        String nome = input.next();
        System.out.print("Sobrenome: ");
        String sobrenome = input.next();

        Cliente cliente = new Cliente(nome, sobrenome, "1234", "Rua X");

        System.out.println("Capacidade da agencia: " + agencia.contas.length);

        Conta conta = agencia.criarConta(123, cliente);

        System.out.println("Informe a quantia a depositar: ");
        double valor = input.nextDouble();
        conta.depositar(valor);

        agencia.exibirSaldos();

        input.close();
    }
}
