package Atividades;

public class Aula_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long totalMiliSegundos = System.currentTimeMillis() ;// o Tempo e  de milicegundos desde 1970
		
		long totalSegundos = totalMiliSegundos / 1000;
		long segundoAtual = totalSegundos % 60;
		
		long totalMinutos = totalSegundos / 60;
		long minutoAtual = totalMinutos % 60;
		
		
		long totalHora = totalMinutos % 60;
		long horaAtual = totalHora % 24;
		
		System.out.println(horaAtual+ ":"+minutoAtual+":" +segundoAtual);
		

	}

}
