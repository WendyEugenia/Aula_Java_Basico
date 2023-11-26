package Atividades;

public class Aula_32 {

	public static void main(String[] args) {
		
		int i;
		//outra maneira de informar os valores do vetor e com virgula
		//int[] x = { 155, 1, 5454,6,84,9};
		
		int[] x = new int[10];
							//x=local  3=o numero que deve ser mudadp nas quantidades  
		java.util.Arrays.fill(x, 2, 8, 3);//o fill faz mudar os quaais quero mudança
		
		for(i = 0; i < x.length; ++i) {
			System.out.println(x[i]);
		}
		
	}
}
