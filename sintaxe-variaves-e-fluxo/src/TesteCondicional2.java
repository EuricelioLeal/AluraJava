
public class TesteCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Voc? nao pode entrar");

		}
		
		// Exemplo 2 
		
		idade = 16;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo 2");
		} else {
			System.out.println("Voc? nao pode entrar");
		}
	}
}
