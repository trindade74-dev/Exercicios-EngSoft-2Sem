//MENU DE CADASTRO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_09_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		int option;
		String nome;

		System.out.println("==OLA USUARIO!! FAÇA SEU CADASTRO!!==");
		System.out.println("(1) CADASTRO");
		System.out.println("(2) CONSULTAR");
		System.out.println("(3) SAIR");
		option = captura.nextInt();
		captura.nextLine();

		switch (option) {
		case 1:
			System.out.println("digite seu nome");
			nome = captura.nextLine();
			System.out.println("Seu cadastro foi realizado bem vindo " + nome);
			break;
		case 2:
			System.out.println("digite seu nome");
			nome = captura.nextLine();
			System.out.println(nome + " nao há cadastros com esse nome ai nao, reinicie o programa!");
			break;
		case 3:
			System.out.println("Até a proxima!");
			break;
		default:
			System.out.println("ESCOLHA DE 1-3");
		}
	}
}
