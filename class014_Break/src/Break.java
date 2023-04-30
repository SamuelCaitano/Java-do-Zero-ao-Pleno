// neste exemplo caso a condição seja verdadeira
// o BREAK termina a execução do laço FOR

public class Break {

	public static void main(String[] args) {
		
		int x = 3;
		
		for (int i = 1; i <= x; i++) {
						
			if(i == 2) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("FIM");
	}
}