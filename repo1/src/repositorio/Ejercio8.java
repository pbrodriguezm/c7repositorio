package repositorio;

import java.util.Scanner;

public class Ejercio8 {
	public Ejercio8() {
		
		// TODO Auto-generated constructor stub
		System.out.println("Escriba un n�mero:");
		Scanner teclado = new Scanner(System.in);
		int numero= teclado.nextInt();
			System.out.println("Escriba un n�mero mayor que:"+numero);
			int numero1= teclado.nextInt();
			while(numero1>numero) {
				System.out.println("Ingrese un numero mayor que:"+numero);
				int numero2=teclado.nextInt();
				numero1=numero2;
			} 
			System.out.println(numero1+"no es mayor que"+numero+"\n Programa terminado");
			}
						
	}


