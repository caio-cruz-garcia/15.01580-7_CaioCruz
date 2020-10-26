package teoria.aula3tec;

import teoria.aula3tec.RankedNinja;

public class Jonin extends RankedNinja {
    public Jonin(String name, String family, String mission) {
        super(name, family, mission);
    }

    @Override
    public void train(){
        System.out.println("Treinando para:"+ mission);
    }
}
