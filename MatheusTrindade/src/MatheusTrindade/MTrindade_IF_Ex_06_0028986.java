//VERIFICACAO DE SENHA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_06_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		String senhaCadastrada = "123456";
		String senhaDigitada;

		System.out.println("==Digite sua senha==");
		senhaDigitada = captura.nextLine();

		if (senhaDigitada.equals(senhaCadastrada)) {
			System.out.println("Senha correta! Acesso liberado.");
		} else {
			System.out.println("Senha incorreta! Acesso negado.");
		}
	}

}
