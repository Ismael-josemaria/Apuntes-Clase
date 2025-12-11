package ejercicios;

import java.util.Scanner;


public class ejercicio1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	int numeros = sc.nextInt();
	sc.next();
	String letras = sc.next();
	if(numeros == 9999){
		letras += 1;
		StringBuilder letrero = new StringBuilder(letras);
		for (int i = 0; i < letrero.length(); i++) {
			char letrita = letrero.charAt(i);
			
			if("aeiou".contains(String.valueOf(letrita))) {
				letras.substring() ;
				
			}
			
			
		};
		numeros=0000;
		
	}else {
		numeros+=1;
	}
	
	
	System.out.print(numeros);
	}
	
	
}
