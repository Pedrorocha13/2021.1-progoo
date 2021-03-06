public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;

        Cliente c = new Cliente("Victor", "Machado", "111.222.333-44", "r. X");

        minhaConta = new Conta(123, c, "1111-1");
        minhaConta.depositar(1000.0);

        System.out.println(minhaConta.exibeInfoConta());

        minhaConta.sacar(200.0);
        minhaConta.depositar(500.0);

        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());

        minhaConta.sacar(10000);
        if (minhaConta.estaUsandoLimite()) {
            System.out.println("Está usando o limite.");
        } else {
            System.out.println("Não está usando o limite");
        }

        Conta c1 = new Conta();
        Conta c2;

        c1.depositar(100);
        c2 = c1;
        c2.depositar(300);

        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());

        if (c1 == c2) {
            System.out.println("Contas iguais");
        } else {
            System.out.println("Contas diferentes");
        }

        c2 = new Conta();
        c2.depositar(400);

        if (c1 == c2) {
            System.out.println("Contas iguais");
        } else {
            System.out.println("Contas diferentes");
        }

        c1.transferir(100, c2);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
    }
}
