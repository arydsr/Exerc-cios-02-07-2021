package aula2;

import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {

	double x;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	x = entrada.nextInt();
	
	

	if(x%2==0) {
		System.out.println("O n�mero informado � par");
		System.out.println("Sua raiz quadrada �: " + Math.sqrt(x));
	}
	else {
		System.out.println("O n�mero informado � impar");
		System.out.println("Seu quadrado �: " + Math.pow(x,2.0) );
	}
	
	}
}
