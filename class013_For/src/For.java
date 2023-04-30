public class For {

	public static void main(String[] args) {
		
		String jogador[] = {"Neymar Jr", "Vini Jr", "Rodrigo Goes"};
		 
		for (int i = 0; i < jogador.length; i++) {
			System.out.println("O nome do jogador " + jogador[i] +
					" tem " + jogador[i].trim().replaceAll("\\s+", "").length() +
					" letras.");			
		}
	}
}