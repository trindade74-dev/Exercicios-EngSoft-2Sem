//IDADE MINIMA PARA VOTAR

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_05_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int idade;
		int idadeMinimaVoto = 16;

		System.out.println("==Digite sua idade==");
		idade = captura.nextInt();

		if (idade >= idadeMinimaVoto) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você ainda não pode votar!");
		}
	}

}
