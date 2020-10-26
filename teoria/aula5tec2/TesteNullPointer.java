package teoria.aula5tec2;

public class TesteNullPointer {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            frase = null;
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Frase Original: "+ frase);
        System.out.println("Frase Modificada: "+ novaFrase);
    }
}
