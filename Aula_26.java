package Atividades;

import java.util.Scanner;

public class Aula_26 {
	//achando seu numero
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);   
		
		System.out.println("Digite um numero de 0 a 10:");
		int numero = leia.nextInt();
		
		for (int i = 0; i<=10; ++i ) { //for e feito para uma repetição com umacondição

		if(numero == i){
			System.out.println("Seu numero é: "+i);
			break;
		}else {
			System.out.println("Seu numero não é: "+i);
		}
	}
}
}
