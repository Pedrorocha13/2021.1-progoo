public class Foca extends Mamifero {

    @Override
    String amamentar() {
        return "Est� amamentando!";
    }

    @Override
    String emitirSom() {
        return "ih ih";
    }

    @Override
    String movimentar() {
        return super.movimentar() + "\nE tamb�m est� nadando!";
    }

}
