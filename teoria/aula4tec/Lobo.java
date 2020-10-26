package teoria.aula4tec;

public class Lobo extends Canino {
    public void comer() {
        System.out.println("Chapeuzinho");
    }

    @Override
    public void cheirar(){
        System.out.println("Vishhh");
    }

    public void comoMeLocomovo() {
        System.out.println("Andando");
    }
}
