package teoria.aula3tec;

public class RankedNinja extends Ninja{
    protected String mission;

    //construtor
    public RankedNinja(String name,String family,String mission){
        super(name,family);
        this.mission = mission;
    }

    @Override
    public void train(){
        System.out.println("No pain no gain!");
    }

    final public void goToMission(){
        System.out.println("Indo para missao!:"+ mission);
    }
}
