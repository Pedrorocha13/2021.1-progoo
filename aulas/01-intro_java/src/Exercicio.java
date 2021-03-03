public class Exercicio {
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        System.out.println(gastoTrimestre);

        double media = gastoTrimestre / 3.0;
        System.out.println(media);
    }
}
