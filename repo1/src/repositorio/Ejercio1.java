package repositorio;

import java.util.Scanner;

public class Ejercio1 {

	public Ejercio1() {

		// INGRESAR NUMEROS HASTA QUE SE INGRESE UN NUMERO NEGATIVO Y ME MUESTRE 
		//LA SUMA DE LOS NUMEROS POSITIVOS INGRESADOS
		Scanner teclado = new Scanner(System.in);
		
		int valor = 0;
		int sum=0;
		//
		do {
			System.out.print("Ingrese numero: ");
			int valor1 = teclado.nextInt();
			valor =  valor1;
			if(valor1>0) {
				sum=valor+sum;
			}

		}while (valor > 0) ;
		
		
		System.out.println("La suma de los numeros positivos es: "+sum);

	}

}
