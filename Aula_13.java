package Atividades;

import java.util.Scanner;

public class Aula_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.1456; // final informando que não sera alterado o PI
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		double raio = leia.nextDouble();
		
		double area = raio * raio * PI;
		
		System.out.println(" O valor da área é: " +area);
		
		
		

	}

}
