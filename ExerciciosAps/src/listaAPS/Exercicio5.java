package listaAPS;

import java.util.Scanner;

/*Fa�a um programa que pe�a o tamanho de um arquivo para download (em MB) e a 
velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado 
de download do arquivo usando este link (em minutos).
*/
public class Exercicio5 {
	public static void main(String[] args) {
		double arq , velocidade,download,downloadTempo;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do arquivo?");
		arq = dado.nextDouble();
		System.out.println("Qual a velocidade da sua rede?");
		velocidade = dado.nextDouble();
		dado.close();
		download = arq / (velocidade / 8); //taxa de transferencia em MB/s
		downloadTempo = download / 60; //transformar em minutos
		
		System.out.printf("O arquivo de tamanho %.2f MB em uma rede de "
				+ "velocidade de %.1f Mbps ir� demorar cerca de %.2f Min. para ser baixado",arq,velocidade,downloadTempo);
	
		
	}
}
