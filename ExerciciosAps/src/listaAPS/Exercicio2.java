package listaAPS;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	Double area,dobArea,larg,alt;
	
	Scanner dado = new Scanner(System.in);
	
	System.out.println("Ola, Qual a largura do quadrado que voc� deseja saber a �rea?");
	larg = dado.nextDouble();
	System.out.println("Qual a altura do quadrado que voc� deseja saber a �rea?");
	alt = dado.nextDouble();
	dado.close();
	
	area = larg * alt;
	dobArea = area * 2;
	System.out.printf("O seu quadrado de largura igual a  %.2f e altura igual a %.2f possui uma area de %.2f "
			+ "e o dobro dessa altura � de %.2f",larg,alt,area,dobArea);
}
}
