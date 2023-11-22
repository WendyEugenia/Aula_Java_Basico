package Atividades;

import java.util.Scanner;

public class Aula_20 {

	public static void main(String[] args) {
		//PAr o impar
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("insira um numero inteiro: ");
		int numero = leia.nextInt();
		
		if ((numero % 2 == 0) && (numero <20)) { // || pode se usar o OU uma deslas tem que ser true
			System.out.println("\n OK");
		}
		
	}
}
// != diferente