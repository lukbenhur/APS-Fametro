package listaAPS;


import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		double precoRefeicao,quilo,totalPagar;
		Scanner dado = new Scanner(System.in);
		precoRefeicao = 12.00;
		
		System.out.println("Bem vindo ao restaurante Bem-Bão!!");
		System.out.println("Qual o peso do prato montado pelo Cliente ?");
		quilo = dado.nextDouble();
		dado.close();
		totalPagar = precoRefeicao * quilo;
		System.out.printf("O valor a ser pago é de: %.2f",totalPagar);
	}
}
