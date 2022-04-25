package listaAPS;

import java.util.Scanner;

/*
 * Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o 
aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o 
salário final

adaptei o programa para receber o valor do aumento como entrada e calcular tudo com base nas entradas 
(a porcentagem de aumento e de reduçao(apos o aumento))
 */
public class Exercicioo10 {
	public static void main(String[] args) {
		double salarioBruto,salarioLiquido,salarioAumentado,aumento,reducao;
		Scanner dado = new Scanner(System.in);
		
		System.out.println("Qual o salario bruto do funcionario?");
		salarioBruto = dado.nextDouble();
		System.out.println("Qual o aumento que terá o salario em %?");
		aumento = dado.nextDouble();
		System.out.println("Qual valor do desconto?");
		reducao = dado.nextDouble();
		dado.close();
		
		salarioAumentado = (salarioBruto * (aumento/100)) + salarioBruto;
		salarioLiquido =  salarioAumentado - (salarioAumentado * (reducao/100));
		
		System.out.printf("O valor do salario bruto do funcionario é de R$%.2f, com aumento de %.0f%% o salario foi para R$%.2f, e após a redução de %.0f%%"
				+ " o salario foi para R$%.2f.",salarioBruto,aumento,salarioAumentado,reducao,salarioLiquido);
	}
}
