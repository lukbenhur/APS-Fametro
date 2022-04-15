package listaAPS;
import java.util.Scanner;

public class Exercicio1 {
 public static void main(String[] args) {
	double metro,cent;
	String nome;
	Scanner dado = new Scanner(System.in);
	
	System.out.println("Olá! Qual seu nome?");
	nome = dado.nextLine();
	System.out.println("Entre com o valor em metros que voce deseja converter.");
	metro = dado.nextDouble();
	dado.close();
	cent = metro * 100;
	System.out.printf("%s, o valor %.2fM em centímetros é igual a: %.2f",nome,metro,cent);
}
}
