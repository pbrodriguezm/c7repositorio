package repositorio;
import java.util.Scanner;

public class Ejercio5 {
	public Ejercio5() {
		
		// TODO Auto-generated constructor stub
		Scanner teclado = new Scanner(System.in);
		int[] Numeros;
		int Largo;
		int Comparar;
		int Contador = 0;
		
		System.out.print("Ingrese tamaño de array: ");
		Largo = teclado.nextInt();
		System.out.print("Ingrese numero mayor de comparacion: ");
		Comparar = teclado.nextInt();
		
		Numeros = new int[Largo];
		
		for(int valor = 0; valor < Numeros.length; valor++) {
			System.out.print("Ingrese valor " + valor + ": ");
			Numeros[valor] = teclado.nextInt();
		}
		
		for(int valor = 0; valor < Numeros.length; valor++) {
			if(Comparar > Numeros[valor])
			Contador++;
		}
		
		System.out.print("Se tiene " + Contador + " valores mayores que " + Comparar);
	}
}
