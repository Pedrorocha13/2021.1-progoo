public class Variables {
    public static void main(String[] args) {
        // Variáveis - Tipos Primitivos
        // Dados inteiros:
        byte idade = 15; // Ocupa 1 byte (-128 a 127)
        short ano = 2021; // Ocupa 2 bytes (-32.768 a 32.767)
        int negativo = -15000; // Ocupa 4 bytes (-2.147.483.648 a 2.147.483.647)

        long muitoGrande = 78522214801l; // Ocupa 8 bytes (-9.22E18 a 9.22E18)

        // Dados em ponto flutuante:
        double piLongo = 3.1415926535897932384626433832795028841971; // Ocupa 8 bytes

        float pi = 3.14f; // Ocupa 4 bytes

        // Dados booleanos:
        boolean verdadeiro = true; // Ocupa 1 bit
        boolean falso = false;

        // Caracteres:
        char letra = 'a'; // Usa o código UNICODE e ocupa 2 bytes

        // Operadores aritméticos
        int proximaIdade = idade + 1;
        int idadeAnterior = idade - 1;
        int dobroIdade = idade * 2;
        int metadeIdade = idade / 2;
        int idadeEPar = idade % 2;

        // Passagem de valor
        int i = 5;
        int j = i;

        i += 1;

        System.out.println(i); // 6
        System.out.println(j); // 5

        double k = 5;
        // int l = k;

        int m = 2;
        double n = m;

        // Casting é a conversão de um tipo de dado maior em um menor;
        double o = (int) n;
    }
}
