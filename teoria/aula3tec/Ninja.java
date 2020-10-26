package teoria.aula3tec;

public class Ninja {
    private String name;
    private String family;
    private String[] jutsus;

    //construtor da classe ninja
    public Ninja(String nome, String family){
        this.name = name;
        this.family = family;
        jutsus = new String[5];
    }
    public void train(){
        System.out.println("Hoho!");
    }
}
