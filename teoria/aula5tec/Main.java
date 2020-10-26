package teoria.aula5tec;

//import teoria.pacote.Dog;
import teoria.pacote.QualquerCoisa;

public class Main {
    public static void main(String[] args) {
        QualquerCoisa meuQualquerCoisa = new QualquerCoisa();
        Dog dog1 = new Dog(30);
        teoria.pacote.Dog dog2 = new teoria.pacote.Dog(3);
        dog1.bark();
        meuQualquerCoisa.ola();
        dog2.bark();

    }
}

