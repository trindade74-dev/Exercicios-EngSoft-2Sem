//DIAS DA SEMANA


package MatheusTrindade;

import java.util.*;

public class MTrindade_IF_Ex_07_0028986 {

	public static void main (String[] args) {
		Scanner captura = new Scanner (System.in);
		int dia = 7;
		
		System.out.println("digite um numero de 1-7");
		dia = captura.nextInt();
		switch(dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda");
			break;
		case 3:
			System.out.println("terca");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;	
		default:
			System.out.println("dia invalido!!!!!");
		}
	}
	
	}