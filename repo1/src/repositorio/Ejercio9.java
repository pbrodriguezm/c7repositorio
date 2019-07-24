package repositorio;

import java.util.Scanner;

public class Ejercio9 {

	public Ejercio9() {
		// TODO Auto-generated constructor stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("De cuantos numeros sera el histograma");
		int x = teclado.nextInt();
		int[] num = new int[x];

		System.out.println("Ingrese los " + x + " numeros para el histograma");

		for (int i = 0; i < num.length; i++) {
			System.out.print("Ingrese el " + (i + 1) + " numero: ");
			num[i] = teclado.nextInt();
		}

		System.out.println(" ");
		
		for (int e = 0; e < x; e++) {
			for (int i = 0; i < num[e]; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}
}
