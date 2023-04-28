import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float nota;

		System.out.print("Informe sua nota: ");
		
		nota = input.nextFloat(); // lê o número fornecido pelo usúario

		/*
		 * se formos utilizar apenas uma instrução dentro do if else, não necessita
		 * colocar chaves, por legibilidade SEMPRE utilize o bloco de chaves de abertura
		 * e fechamento
		 */
		if (nota >= 6)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");

		// essa impressão será mostrada, independente do resultado, 
		// pois não está dentro do escopo da estrutura de condição
		System.out.println("fim do programa");
		
		input.close();
	}
}