package exercicios;

import java.util.Scanner;

public class Jogodavelha {
    private exercicios.Jogador j1, j2;

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imforme o nome do Jogador 1:");
        String nome = scanner.nextLine();
        System.out.println("Jogada do jogador 1:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Tesoura");
        System.out.println("3 - Papel");
        int escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha){
            case 1:
            j1 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.PEDRA); break;
            case 2:
            j1 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.TESOURA); break;
            default:
            j1 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.PAPEL); break;
        }
        System.out.println("Imforme o nome do Jogador 2:");
        nome = scanner.nextLine();
        System.out.println("Jogada do jogador 2:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Tesoura");
        System.out.println("3 - Papel");
        escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha){
            case 1:
            j2 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.PEDRA); break;
            case 2:
            j2 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.TESOURA); break;
            default:
            j2 = new exercicios.Jogador(nome, exercicios.Jogadadavelha.PAPEL); break;
        }

        System.out.println("J1 - " + j1.competicao(j2) + "- J2");
    }
}