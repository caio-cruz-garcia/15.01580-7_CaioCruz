package exercicios;

public class Jogadadavelha {
    private String escolha, ganhoDe,percoDe;

    public static final String PEDRA = "pedra";
    public static final String TESOURA = "tesoura";
    public static final String PAPEL = "papel";

    public Jogadadavelha(String opcao){
        if(opcao.equals(this.PEDRA)){
            ganhoDe = this.TESOURA;
            percoDe = this.PAPEL;
        } else if(opcao.equals(this.PAPEL)){
            ganhoDe = this.PEDRA;
            percoDe = this.TESOURA;
        } else {
            ganhoDe = this.PAPEL;
            percoDe = this.PEDRA;
        }
        escolha = opcao;
    }
    public String getEscolha(){
        return this.escolha;
    }
    public String avaliar(Jogadadavelha jogada){
        if(jogada.getEscolha().equals(this.ganhoDe)){
            return "Ganhei!";
        } else if(jogada.getEscolha().equals(this.percoDe)){
            return "Perdi!";
        }
        else{
            return "Empate!";
        }
    }
}