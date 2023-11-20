package Atividades;

import java.util.Scanner;

public class Aula_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  leia = new Scanner (System.in);
		
		System.out.println("Insira o valor em gramas:");
		int gramas = leia.nextInt();
		
		int kilos = gramas/1000; // como o kilo e mil o que sobrar e as gramas
		gramas = gramas % 1000;// o sinal de  % e de resto 
		
		System.out.println("O valor de kilo é: " +kilos+ " kl");
		System.out.println("O valor de gramas é: " +gramas+" g");

	}

}
