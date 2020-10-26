package teoria.aula3tec;

import teoria.aula3tec.RankedNinja;

public class Genin extends RankedNinja {
    public Genin(String name, String family, String mission) {
        super(name, family, mission);
    }

    public void mudarMissao() {
        mission = "olá mundo";
    }
}
