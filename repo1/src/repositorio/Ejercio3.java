package repositorio;

import java.util.Scanner;

public class Ejercio3 {
	public Ejercio3() {

		// TODO Auto-generated constructor stub
		int[] IngreseValor = new int[4];
		IngreseValor[0] = 10;
		IngreseValor[1] = 30;
		IngreseValor[2] = 60;
		IngreseValor[3] = 70;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese el maximo valor:");
		int nm = teclado.nextInt();
		int contador=0;
		
		for (int i = 0; i < IngreseValor.length; i++) {
			if (IngreseValor[i] > nm) {
				contador=contador+1;
				System.out.println(IngreseValor[i] + "si es mayor");
			}
		}

		System.out.println( "tenemos "+contador+" positivos");

	}
}
