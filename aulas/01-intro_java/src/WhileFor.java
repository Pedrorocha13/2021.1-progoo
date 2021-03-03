public class WhileFor {
    public static void main(String[] args) {
        /*
        while (condicao) {
            codigo;
        }
        */

        int idade = 15;
        while (idade < 18) {
            idade++;
            System.out.println(idade);
        }

        /*
        for (inicializacao; condicao; incremento) {
            codigo;
        }
        */

        idade = 15;
        for (int i = 15; i < 18; i++) {
            idade++;
            System.out.println(idade);
        }

        // break
        int x = 5;
        int y = 30;

        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19");
                break;
            }
        }

        // continue
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }
    }
}
