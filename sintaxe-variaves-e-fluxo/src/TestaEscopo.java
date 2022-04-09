
public class TestaEscopo {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2 ) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você nao pode entrar");

		}
		
		// Exemplo 2 
		
		idade = 16;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo 2");
		} else {
			System.out.println("Você nao pode entrar");
		}
	}

}
