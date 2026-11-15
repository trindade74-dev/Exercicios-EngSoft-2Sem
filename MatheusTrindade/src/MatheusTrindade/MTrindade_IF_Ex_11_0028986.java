//OPERACAO MATEMATICA

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_11_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		double num1, num2;
		int operacao;

		System.out.println("Digite o primeiro numero");
		num1 = captura.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = captura.nextDouble();

		System.out.println("Escolha a operação: (1) Soma (2) Subtração (3) Multiplicação (4) Divisão");
		operacao = captura.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Resultado: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Resultado: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Resultado: " + (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println("Resultado: " + (num1 / num2));
			} else {
				System.out.println("Não é possível dividir por zero!");
			}
			break;
		default:
			System.out.println("Operação inválida!");
		}
	}

}
