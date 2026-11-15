//MENU COM SAIDA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_23_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("==MENU==");
			System.out.println("(1) OPÇÃO 1");
			System.out.println("(2) OPÇÃO 2");
			System.out.println("(3) SAIR");
			opcao = captura.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu a opção 1");
				break;
			case 2:
				System.out.println("Você escolheu a opção 2");
				break;
			case 3:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 3);
	}

}
