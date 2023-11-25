package Atividades;

import java.util.Scanner;

public class Aula_27 {
	//trocar switch
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);   
		
		System.out.println("Selecione um numero de 1 a 5:");
		int numero = leia.nextInt();
		
		switch(numero){
		case 1:
			System.out.println("Você escolheu 1.");
			break;
		case 2:
			System.out.println("Você escolheu 2.");
			break;
		case 3:
			System.out.println("Você escolheu 3.");
			break;
		case 4:
			System.out.println("Você escolheu 4.");
			break;
		case 5:
			System.out.println("Você escolheu 5.");
			break;
			default:
				System.out.println("Escolher numero da  lista");
		}
	}
}
