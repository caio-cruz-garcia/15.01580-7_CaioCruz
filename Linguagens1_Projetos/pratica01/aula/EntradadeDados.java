import java.util.Scanner;

public class EntradadeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Informe Seu Nome:");
		nome = scanner.nextLine();
		System.out.println("Ola " + nome);
		int n1, n2;
		System.out.println("Tnforme os numeros:");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		System.out.println("Soma: " + (n1+n2));
		
	}

}