package repositorio;

import java.util.Scanner;

public class Ejercio10 {
	public Ejercio10() {

		// TODO Auto-generated constructor stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un valor l�mite positivo");

		double numlimite = teclado.nextDouble();

		while (numlimite <= 0) {
			System.out.println("El valor debe ser mayor a 0. Ingrese un nuevo valor");
			numlimite = teclado.nextDouble();
		}

		System.out.println("Ingrese un n�mero");
		double num1 = teclado.nextDouble();
		if (num1 > numlimite) {
			System.out.println("El n�mero ingresado ha superado al n�mero limite. Programa terminado");
		} else {

			System.out.println("Ingrese otro n�mero");
			double num2 = teclado.nextDouble();
			
			double suma = num1 + num2;
			
			while (suma < numlimite) {

				System.out.println("Ingrese otro n�mero");
				 double num3 = teclado.nextDouble();
				 
				suma += num3;
			}

			System.out.println("La suma es :" + suma);
			System.out.println("El numero ah superado el limite");
		}

	}
}
