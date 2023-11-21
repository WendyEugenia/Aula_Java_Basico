package Atividades;

import java.util.Scanner;

public class Aula_19 {

	public static void main(String[] args) {
		//
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual é seu nome? ");
		String nome = leia.nextLine();//
		
		System.out.println("\nQual é sua idade? ");
		int idade = leia.nextInt();
		
		if(idade < 1){ // o if e só uma instrução
			System.out.println("idade informada não é valida");
		}else if(idade <18){ //
			System.out.println("\n Você é menor de Idade !!");
		}else {//caso contrario
			System.out.println("\n Você é maior de Idade !!");
		}
	}

}
