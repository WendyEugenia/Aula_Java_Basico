package Atividades;

import java.util.Random;
import java.util.Scanner;

public class Aula_25 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		boolean acertou = false;
		int tentativas =10;
		int numeroSecreto =random.nextInt();
		long chute =0;
		
		System.out.println(numeroSecreto);
		
		while (tentativas > 0 && acertou == false) {
			System.out.println("\nQual seu chute? ");
			chute = leia.nextLong();
			
			if(numeroSecreto == chute) {
				System.out.println("\nVocê acertou!!");
				acertou = true;
			} else if(chute < numeroSecreto) {
				--tentativas;
				System.out.println("Numero pequeno! " +tentativas+ " tentativas restantes");
			}else {
				--tentativas;
				System.out.println("Numero grande! " +tentativas+ "tentativas restantes");
			}
		}
		
	}
}
