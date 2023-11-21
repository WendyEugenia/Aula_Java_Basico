package Atividades;

import java.util.Scanner;

public class Aula_17 {

	public static void main(String[] args) {
		//usando string em java
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual é seu primeiro nome? ");
		String primeiroNome = leia.next();//a String so consegue pegar um nome e não dois como nome composto
		
		
		System.out.println("\nQual é seu segundo nome? ");
		String segundoNome = leia.next();

		System.out.println("\nQual é sua idade? ");
		int idade = leia.nextInt();
		
		System.out.println("\n Olá " +primeiroNome+ " "+segundoNome+" de " + idade+" anos.");
	}

}
