import java.util.Scanner;

public class If_Else_Aninhado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idade;

		System.out.print("Insira sua idade: ");
		idade = input.nextInt();

		// usamos o if e o else if para verificar qual classificação você está
		if (idade < 0) {
			System.out.println("Você ainda nem nasceu!");
		} else if (idade <= 12) {
			System.out.println("Você é criança!");
		} else if (idade <= 18) {
			System.out.println("Você é adolecente");
		} else if (idade <= 59) {
			System.out.println("Você é jovem");
		} else if (idade <= 122) {
			System.out.println("Você é idoso");
		} else {
			System.out.println("Você é imortal");
		}

		input.close();
	}
}