package com.avanade;

import java.util.Scanner;

public class calculadora {

	public static void main (String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int numero1=0;
		int numero2=0;
		int soma=0;
		
		System.out.print("Digirte o primeiro nuemro:");
	    numero1 = entrada.nextInt();
	    
	    System.out.print("Digite o segundo numero; ");
	    numero2 = entrada.nextInt();
	    
	    soma = numero1+numero2;
	    
	    System.out.printf("A soma e %d\n", soma );
	
	}
}

