package listaAPS;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para 
ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu 
colocar no tanque.
 */
public class Exercicio9 {
	public static void main(String[] args) {
		Double valorPago,precoLitro,qtdLitros;
		Scanner dado = new Scanner(System.in);
		DecimalFormat DF = new DecimalFormat("#.##");
		
		System.out.println("Qual o valor do litro da gasolina?");
		precoLitro = dado.nextDouble();
		System.out.println("Quanto, em reais, você deseja colocar de gasolina?");
		valorPago = dado.nextDouble();
		dado.close();
		
		qtdLitros = valorPago / precoLitro;
		
		System.out.println("A quantidade de litros colocado pelo motorista é de: " + DF.format(qtdLitros) + ".");
	}
}
