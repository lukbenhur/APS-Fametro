package listaAPS;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Integer num1,num2;
		Double num3,a,b,c;
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro:");
		num1 = dado.nextInt();
		System.out.print("Digite o segundo n�mero inteiro:");
		num2 = dado.nextInt();
		System.out.print("Digite um numero REAL:");
		num3 = dado.nextDouble();
		dado.close();
		
		a = (double) ((2 * num1) * (num2 / 2));
		b = (3 * num1) + num3;
		c = Math.pow(num3, 3);
		
		System.out.printf("o produto do dobro do primeiro com metade do segundo �: %.2f %n",a);
		System.out.printf("a soma do triplo do primeiro com o terceiro �: %.2f%n",b);
		System.out.printf("o terceiro elevado ao cubo �: %.2f",c);
}
}
