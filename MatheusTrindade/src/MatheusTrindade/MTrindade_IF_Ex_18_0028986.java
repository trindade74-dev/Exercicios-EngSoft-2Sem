//SENHA CORRETA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_18_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		String senhaCadastrada = "123456";
		String senhaDigitada;

		System.out.println("Digite a senha");
		senhaDigitada = captura.nextLine();

		while (!senhaDigitada.equals(senhaCadastrada)) {
			System.out.println("Senha incorreta! Tente novamente");
			senhaDigitada = captura.nextLine();
		}

		System.out.println("Senha correta! Acesso liberado.");
	}

}
