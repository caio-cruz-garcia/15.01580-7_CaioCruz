package teoria.aula4tec;

public class Cachorro extends Canino {
    public void comer() {
        System.out.println("Au au!");
    }

    @Override
    public void cheirar(){
        System.out.println("Sniff");
    }
    public void comoMeLocomovo() {
        System.out.println("Andando");
    }
}
