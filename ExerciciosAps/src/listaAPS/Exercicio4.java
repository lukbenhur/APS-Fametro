package listaAPS;

import java.util.Scanner;

/*Fa�a um programa para uma loja de tintas. O programa dever� pedir o tamanho em 
metros quadrados da �rea a ser pintada. Considere que a cobertura da tinta � de 1 litro 
para cada 3 metros quadrados e que a tinta � vendida em latas de 18 litros, que custam 
R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a serem compradas e o 
pre�o total.*/

public class Exercicio4 {
 public static void main(String[] args) {
	Double area,tintas,valorTotal;
	Scanner dado = new Scanner(System.in);
	
	System.out.println("Bem vindo a Hyd Tintas!");
	System.out.println("Qual a �rea do c�modo a ser pintado?");
	area = dado.nextDouble();
	
	dado.close();
	
	tintas = (area/3) / 18;
	valorTotal = Math.ceil(tintas) * 80;
	
	System.out.printf("A quantidade de latas de tintas a ser comprada � de %.0f e o valor a ser pago � R$ %.2f.",Math.ceil(tintas),valorTotal);
}
}
