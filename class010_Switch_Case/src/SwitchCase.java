// A omissão do BREAK, resulta na execução das subsequentes ocorrências
public class SwitchCase {

	public static void main(String[] args) {

		var animal = Animal.CACHORRO;

		switch (animal) {
		case GATO:
			System.out.println("O " + animal + " mia.");
			break;
		case CACHORRO:
			System.out.println("O " + animal + " late.");
			break;
		case LEAO:
			System.out.println("O " + animal + " ruge.");
			break;
		default:
			System.out.println("nenhum animal foi informado!");
			break;
		}
	}

	enum Animal {
		GATO, CACHORRO, LEAO
	}
}