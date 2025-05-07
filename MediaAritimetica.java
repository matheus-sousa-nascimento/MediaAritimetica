/*
 * MediaAritimetica.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MediaAritimetica {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		double num;
		double soma =0;
		double media =0;
		
		while(x < 10){
			x++;
			System.out.print("Digite um numero: ");
			num = entrada.nextInt();
			
			soma += num;
			}
			
		media = soma/10;	
			System.out.print("A media e "+ media);
	}
}

