package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		//Primero habilitamos el escaner
		Scanner sc = new Scanner(System.in);
		//Escaneamos la linea de palabras
		String palabras = sc.nextLine();
		//Quietamos el es con split
		String[] individual = palabras.split(" es ");
		//Creamos un si palabra 0 es igual a palabra 1 diga que Si y sino NO Ignorando las mayusculas.
		if(individual[0].equalsIgnoreCase(individual[1])) {
			System.out.print("Si");
		}else {
			System.out.print("No");
		}
		

	}

}