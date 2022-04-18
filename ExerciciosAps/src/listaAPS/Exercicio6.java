package listaAPS;

import java.util.Scanner;

/*
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em 
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro 
para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam 
R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
 */
public class Exercicio6 {
	public static void main(String[] args) {
		double area,valorFinal,tintaVolume,valorGalao,valorLatas,galao;
		int latas;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual a área a ser pintada?");
		area = dado.nextDouble();
		dado.close();
		
		tintaVolume = area / 6;
		
		latas = (int) tintaVolume / 18;
		valorLatas = latas * 80;
		
		galao = (tintaVolume % 18) / 3.6;
		valorGalao = Math.ceil(galao)* 25;
		galao = Math.ceil(galao);
		valorFinal = valorLatas + valorGalao;
		
		System.out.printf("Serão comprados um total de %d latas e %.0f galoes custando um total de R$ %.2f reais",latas,galao,valorFinal);
		
	}
}
