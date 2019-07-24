package repositorio;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Num de Ejercicio");
		String valor = teclado.next();
		switch (valor) {
		case "1":
			new Ejercio1();
			break;
		case "2":
			new Ejercio2();
			break;
		case "3":
			new Ejercio3();
			break;
		case "4":
			new Ejercio4();
			break;
		case "5":
			new Ejercio5();
			break;		
		case "6":
			new Ejercio6();
			break;	
		case "7":
			new Ejercio7();
			break;	
		case "8":
			new Ejercio8();
			break;		
		case "9":
			new Ejercio9();
			break;		
		case "10":
			new Ejercio10();
			break;	
		case "11":
			new Ejercio11();
			break;	
		case "12":
			new Ejercio12();
			break;	
		case "13":
			new Ejercio13();
			break;	
		}

	}

}
