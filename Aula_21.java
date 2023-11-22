package Atividades;

import java.util.Scanner;

public class Aula_21 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n insira um ano: ");
		int ano = leia.nextInt();
		
		
		boolean x = (ano % 400 == 0) || (ano % 4 ==0 && ano % 100 != 0);
		
		System.out.println(x);
		
		/*if((ano % 400 == 0) || (ano % 4 ==0 && ano % 100 != 0) ){
			System.out.println("Bissexto");
		}*/
		
	}
}
// 