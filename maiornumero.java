package aula2;

import java.util.Scanner;

public class maiornumero {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0 , maior = 0, menor = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o 1� n�mero: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o 1� n�mero: ");
		c = entrada.nextInt();

	    if((a > b) && (a > c))
	        maior = a;

	    else if((b > a)&&(b > c))
	        maior = b;

	    else if((c > a)&&(c > b))
	        maior = c;
	    
	    System.out.println("Digite o 1� n�mero: " + maior);
	   
	}
}