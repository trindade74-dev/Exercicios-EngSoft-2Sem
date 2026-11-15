package uniceplac;

import java.util.Scanner;

public class VerificadorID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// importação bibioteca java.util
		Scanner captura = new Scanner(System.in);
		double nr1, nr2, somar, sub, mult, div, resto, med, medhar;

		System.out.println("==CALCULADORA==");
		System.out.print("Informe o primero numero: ");
		nr1 = captura.nextInt();

		System.out.print("Informe o segundo numero: ");
		nr2 = captura.nextInt();

		//Operações
		somar = nr1 + nr2;
		sub = nr1 - nr2;
		mult = nr1 * nr2;
		div = nr1 / nr2;
		resto = nr1 % nr2;
		med = (nr1 + nr2) / 2;
		medhar = 2/(1/nr1+1/nr2);

		if (med>=6) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
		System.out.println("===RESULTADOS==");
		System.out.println("Total da *SOMA*: " + somar);
		System.out.println("Total da *SUBTRAÇÃO*: " + sub);
		System.out.println("Total da *MULTIPLICAÇÃO*: " + mult);
		System.out.println("Total da *DIVISÃO*: " + div);
		System.out.println("*RESTO DA DIVISAO*: " + resto);
		System.out.println("*RESTO DA DIVISAO*: " + resto);
		System.out.println("*MEDIA ARITMÉTICA*: " + med);
		System.out.println("*MEDIA HARMONICA*: " + medhar);
		System.out.println("*Total da potencia*: " + Math.pow(nr1,nr2));
		
	}

}
