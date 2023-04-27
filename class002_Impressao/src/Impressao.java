public class Impressao {

	public static void main(String[] args) {
		
		// variáveis do tipo String
		String nome = "Samuel";
		String sobrenome = "Caitano";

		System.out.print("print = Imprime o texto e se mantém na mesma linha. ");
		System.out.println("println = Imprime o texto e quebra a linha");
		System.out.printf("%s%s\n", "Imprimindo usando o printf. ",
				"Basta colocar o marcador de lugar para string (%s)");

		System.out.println("Meu nome é " + nome); // o sinal de mais(+), significa concatenação
		System.out.printf("Meu sobrenome é %s \n", sobrenome); // o caractere de escape (\n) quebra a linha
	}
}