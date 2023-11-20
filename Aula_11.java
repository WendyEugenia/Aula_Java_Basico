package Atividades;

import java.util.Scanner;

public class Aula_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		double base, altura,areaRetangulo;
		
		System.out.println("\nInfome o Valor da base: ");
		base = input.nextDouble();
		
		System.out.println("\nInfome o Valor da altura: ");
		altura = input.nextDouble();
				
		areaRetangulo = base * altura;
		
		System.out.println("\n á area de um retangulo de base: "+base);
		System.out.println("\n E a altura: " +altura);
		System.out.println("\n é " +areaRetangulo);
		
	}

}
