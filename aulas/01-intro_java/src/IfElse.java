public class IfElse {
    public static void main(String[] args) {
        /*
        if (condicao) {
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
    }
}
