public class Foca extends Mamifero {

    @Override
    String amamentar() {
        return "Está amamentando!";
    }

    @Override
    String emitirSom() {
        return "ih ih";
    }

    @Override
    String movimentar() {
        return super.movimentar() + "\nE também está nadando!";
    }

}
