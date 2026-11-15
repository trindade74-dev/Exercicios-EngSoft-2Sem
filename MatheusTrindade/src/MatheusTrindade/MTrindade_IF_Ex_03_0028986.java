//APROVACAO DO ALUNO

package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_03_0028986 {

	public static void main (String[] args) {

		Scanner captura = new Scanner(System.in);
		double nota;

		System.out.println("==Digite a nota do aluno==");
		nota = captura.nextDouble();

		if (nota >= 7) {
			System.out.println("Aluno aprovado! Nota: " + nota);
		} else {
			System.out.println("Aluno reprovado! Nota: " + nota);
		}
	}

}
