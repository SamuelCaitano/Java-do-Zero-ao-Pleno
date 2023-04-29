public class SwitchCase {

	public static void main(String[] args) {

		var academia = Status.ABERTA;

		switch (academia) {
		case ABERTA:
			System.out.println("A academia está " + academia);
			break;
		default:
			System.out.println("A academia está " + academia);
			break;
		}
	}

	enum Status {
		ABERTA, FECHADA
	}
}