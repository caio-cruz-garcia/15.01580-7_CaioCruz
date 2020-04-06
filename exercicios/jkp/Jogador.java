package exercicios;

public class Jogador {
    private String nome;
    private exercicios.Jogadadavelha jogada;

    public Jogador(String nome, String escolha){
        this.nome = nome;
        jogada = new exercicios.Jogadadavelha(escolha);
    }
    public exercicios.Jogadadavelha getJogada(){
        return jogada;
    }
    public String competicao(Jogador player2){
        return jogada.avaliar(player2.getJogada());
    }
}