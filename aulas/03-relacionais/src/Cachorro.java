public class Cachorro extends Mamifero implements IAnimalDomesticado, IAnimalEstimacao {

    String tamanho;
    String raca;

    @Override
    String amamentar() {
        return "Aqui cabem até 10!";
    }

    @Override
    String emitirSom() {
        return "au au au";
    }

    @Override
    public void brincar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void levarPassear() {
        // TODO Auto-generated method stub

    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void levarVeterinario() {
        // TODO Auto-generated method stub

    }

    @Override
    public void chamarVeterinario() {
        // TODO Auto-generated method stub

    }

}
