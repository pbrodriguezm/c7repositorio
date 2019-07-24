package repositorio;

import java.util.Scanner;

public class Ejercio9 {

	public Ejercio9() {
		// TODO Auto-generated constructor stub
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar 3 numeros enteros para el histograma");
		
		System.out.print("Ingrese el primer valor : ");
		int a = teclado.nextInt();
		
		System.out.print("Ingrese el segundo valor: ");
		int b = teclado.nextInt();
		
		System.out.print("Ingrese el tercer valor : ");
		int c = teclado.nextInt();
		
		System.out.println(" ");
		System.out.println("Los valores ingresados: ");
		System.out.println(" ");
		System.out.println("["+a+" "+b+" "+c+"]");
		System.out.println(" ");
		System.out.println("El histograma es: ");
		System.out.println(" ");
		for(int i = 0; i < a; i++) {
			System.out.print("*");
		}
		
		System.out.print(" ");
		
		for(int i = 0; i < b; i++) {
			System.out.print("*");
		}
		
		System.out.print(" ");
		
		for(int i = 0; i < c; i++) {
			System.out.print("*");
		}
	}

}
