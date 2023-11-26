package Atividades;

public class Aula_34 {
	//vetores de vetores
	public static void main(String[] args) {
	
		double [] []x = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		
		for(int i =0; i< x.length; ++i) { //
			for( int j =0; j< x[i].length; ++j) { //aqui quer pegar o vetor do vetor que inicia no x
				System.out.print(i + "|" + j + "=" + x[i][j] +"\t");
			}
			System.out.println("\n");
		}
		
	}	
}