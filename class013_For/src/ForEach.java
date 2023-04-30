import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> jogadores = Arrays.asList("Neymar", "Vini Jr", "Rodrigo Goes"); 
		
		System.out.println("ArrayList :" + jogadores + "\n");
		
		for (String jogador : jogadores) { 
			System.out.println(jogador);
		}
	}
}