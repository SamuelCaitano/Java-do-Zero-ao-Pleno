public class DoWhile {

	public static void main(String[] args) {

		int count = 1;

		do {

			if (count == 1) {
				System.out.println("Executa uma vez, antes da condição!");
			}

			System.out.println(count + "º execussão");

			count++; // count = count + 1;

		} while (count <= 10);
	}
}