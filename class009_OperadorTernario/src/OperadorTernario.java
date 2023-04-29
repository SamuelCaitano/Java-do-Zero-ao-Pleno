// o if ternário válida se uma condição e verdadeira ou falsa
// variavel = condição ? verdadeiro : falso ;

public class OperadorTernario {

	public static void main(String[] args) {

		String email = "smlcaitano@gmail.com";
		String senha = "1234";

		String emailDB = "smlcaitano@gmail.com";
		String senhaDB = "4321";

		boolean logar = email.equals(emailDB) ? true : false;

		if (logar) {
			System.out.println("Email correto!");
		} else {
			System.out.println("Email incorreto!");
		}

		// Operador Ternário de Aninhamento
		String user = email.equals(emailDB) ? senha.equals(senhaDB) ? "Logando..." : "Senha incorreta!" : "Email não cadastrado!!";

		System.out.println(user);
	}
}