public class IfElse {
    public static void main(String[] args) {
        /*
        if (condicao) {
            codigo;
        } else if (condicao) {
            codigo;
        } else if (condicao) {
            codigo;
        } else {
            codigo;
        }
        */
        int idade = 15;

        if (idade < 18) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

        boolean amigoDoDono = true;

        if (idade < 18 && amigoDoDono == false) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

        // Operadores booleanos
        /*
        && - "AND"
        || - "OR"
        ! - "Negação"
        == - "Igualdade"
        != - "Diferente"
        */

        // switch
        /*
        switch (variavel) {
            case <valor_1>:
                codigo;
                break;
            case <valor_2>:
                codigo;
                break;
            [...]
            default:
                codigo;
        }
        */

        int numero = 10;

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            default:
                System.out.println("Muito alto");
        }
    }
}
