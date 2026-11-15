//IDADE DO PROFESSOR WILLIIANS

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_01_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int idade;

//===========================================================================

		System.out.println("===Olá querídissimo professor Wiliians!===");
		System.out.println("Digite sua idade por favor!");
		idade = captura.nextInt();

		//Processamento de Dados...

		if (idade >= 18) {
			System.out.println("Maior de idade! Acesso Liberado.");
		} else {
			System.out.println("De menor! Acesso negado!");
		}
	}

}
                                         