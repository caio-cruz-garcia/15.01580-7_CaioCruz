package teoria.implementacoes;

import teoria.models.Dog;

import java.util.ArrayList;

public class ArrayListVersion {
    public static void run(){
        //nao precisa do segundo <Dog> so <>
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        Dog dog = new Dog("D1","Cachorro",1);
        dogs.add(dog);
        dogs.add(new Dog("D2","Musica",55));
        dog = new Dog("D3","Dado",4);
        if(!dogs.contains(dog))
            dogs.add(dog);
        //Método classico do foreach
        for (Dog dogNovo: dogs) {
            System.out.println(dogNovo);
        }

        //Foreach do java8

//        dogs.forEach((cachorroDaLabmda) -> {
//        System.out.println(cachorroDaLabmda)
//        });
    }
}
