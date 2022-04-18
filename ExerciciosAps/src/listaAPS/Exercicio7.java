package listaAPS;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double area,valorFinal,tintaVolume,valorGalao,valorLatas,galao,latas;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual a área a ser pintada?");
		area = dado.nextDouble();
		dado.close();
		
		tintaVolume = area / 6;
		latas = tintaVolume / 18 ;
		latas = Math.ceil(latas);
		System.out.printf(" A quantidade de latas de tinta a ser usada para pintar a area é: %.2f",latas);
		galao = tintaVolume / 3.6;
		galao = Math.ceil(galao);
		System.out.printf("%n A quantidade de latas de tinta a ser usada para pintar a area é: %.2f",galao);
		System.out.println("item C resolvido no exercicio 6");
}
}
