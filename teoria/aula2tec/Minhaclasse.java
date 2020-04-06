package teoria.aula2tec;

public class Minhaclasse {
    private static int contaObjetos = 0;
    private String nome;

    public Minhaclasse(){
        Minhaclasse.contaObjetos = Minhaclasse.contaObjetos +1;
    }

    public static int getContaObjetos(){
        return  Minhaclasse.contaObjetos;
    }
}
