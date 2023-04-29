
public class NewSwitchCase {
 
	@SuppressWarnings("unused")
	private static int result;

	public static void main(String[] args) {

		final String[] meses = { "JANEIRO", "FEVEREIRO", "MARCO", "ABRIL", 
								 "MAIO", "JUNHO", "JULHO", "AGORTO", "SETEMBRO", 
								 "OUTUBRO", "NOVEMBRO", "DEZEMBRO" };

		final String mes = meses[9];

		int dias = getMesLength(mes);

		System.out.println(mes  + " tem " + dias + " dias.");
	}

	public static int getMesLength(String mes) {
		
		return result = switch (mes) {
		case "JANEIRO", "MARCO", "MAIO", "JULHO", "AGORTO", "OUTUBRO", "DEZEMBRO" -> 31;
		case "FEVEREIRO" -> 28;
		case "ABRIL", "JUNHO", "SETEMBRO", "NOVEMBRO" -> 30;
		default -> 0;
		}; 
	}
}