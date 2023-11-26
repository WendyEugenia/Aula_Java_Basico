package Atividades;

import java.util.Scanner;

public class Aula_30_31 {

	//Verotes
	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		
		int numAlunos = 5;
		double [] notaAlunos = new double[numAlunos];
		
		for(int i = 0; i <numAlunos; ++i) {
			System.out.println("Insira a nota do " +(i+1)+ "° Aluno.");//colocando +1 informa que começa no 1 e não no 0
			notaAlunos[i] =leia.nextDouble();
			
		}
		for(int i = 0; i <numAlunos; ++i) {
			System.out.println(" -->" +notaAlunos[i]);
		}
		//
	
	}
}
