package listaAPS;

import java.util.Scanner;

/*
 * Fa�a um algoritmo para ler o sal�rio de um funcion�rio e aument�-Io em 15%. Ap�s o 
aumento, desconte 8% de impostos. Imprima o sal�rio inicial, o sal�rio com o aumento e o 
sal�rio final

adaptei o programa para receber o valor do aumento como entrada e calcular tudo com base nas entradas 
(a porcentagem de aumento e de redu�ao(apos o aumento))
 */
public class Exercicioo10 {
	public static void main(String[] args) {
		double salarioBruto,salarioLiquido,salarioAumentado,aumento,reducao;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual o salario bruto do funcionario?");
		salarioBruto = dado.nextDouble();
		System.out.println("Qual o aumento que ter� o salario em %?");
		aumento = dado.nextDouble();
		System.out.println("Qual valor do desconto?");
		reducao = dado.nextDouble();
		dado.close();
		
		salarioAumentado = (salarioBruto * (aumento/100)) + salarioBruto;
		salarioLiquido =  salarioAumentado - (salarioAumentado * (reducao/100));
		
		System.out.printf("O valor do salario bruto do funcionario � de R$%.2f, com aumento de %.0f%% o salario foi para R$%.2f, e ap�s a redu��o de %.0f%%"
				+ " o salario foi para R$%.2f.",salarioBruto,aumento,salarioAumentado,reducao,salarioLiquido);
	}
}
