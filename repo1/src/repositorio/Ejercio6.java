package repositorio;

import java.util.Scanner;

public class Ejercio6 {
	public Ejercio6() {

		// TODO Auto-generated constructor stub
		int num1 = 0;
		int num2 = 0;
		int var,valor,variab,variable;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero");
		valor = teclado.nextInt();

		
		System.out.println("Escriba un un numero mayor que " + valor);
		variable = teclado.nextInt();
		int resultado = (0);
		if (variable > valor) {
			
			System.out.println("Los numeros que ha escrito son " + variable + "," + valor);
			 variab = teclado.nextInt();

		} else {
			
			System.out.println(variable + " no es mayorque " + valor);
			 var = teclado.nextInt();
		}
	}
}
