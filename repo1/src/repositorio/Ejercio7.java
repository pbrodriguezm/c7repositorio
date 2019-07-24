package repositorio;

import java.util.Scanner;

public class Ejercio7 {
	public Ejercio7() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la palabra: ");
		String valor = teclado.next(); // leer el teclado

		char[] arrayvalor = valor.toCharArray(); // lo guarde en un array
		for (int i = 0; i < valor.length(); i++) {

			System.out.println(arrayvalor[i]);
		}
	}
}
