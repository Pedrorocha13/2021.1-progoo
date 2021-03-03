public class Increment {
    public static void main(String[] args) {
        // Uso do incremento

        int idade = 15;

        idade = idade + 1; // 16
        idade += 1; // 17

        // Pós incremento
        idade++; // idade 18

        int novaIdade = idade++;

        System.out.println(idade); // 19
        System.out.println(novaIdade); // 18

        // Pré incremento
        int novaNovaIdade = ++idade;

        System.out.println(idade); // 20
        System.out.println(novaNovaIdade); // 20

        idade--;
        --idade;
    }
}
