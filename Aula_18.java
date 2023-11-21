package Atividades;

import java.util.Scanner;

public class Aula_18 {

	public static void main(String[] args) {
		//usando o IF
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual é seu nome? ");
		String nome = leia.nextLine();//nextLine pode ser usado em dois nomes, pois procura um espaço para replicar
		
		System.out.println("\nQual é sua idade? ");
		int idade = leia.nextInt();
		
		if(idade >=18) {
			System.out.println("\n Voce é maior de Idade !!");
		}
	}

}
