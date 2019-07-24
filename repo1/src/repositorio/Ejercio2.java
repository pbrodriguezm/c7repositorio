package repositorio;

import java.util.Scanner;
import java.util.Random;

public class Ejercio2 {
	public Ejercio2() {
		// detectarvocales();
		tresenraya();
	}

	public void detectarvocales() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su nombre : ");
		String nombre = teclado.next();
		String resultado = "";
		for (int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				resultado += letra + ",";
			}
		}
		System.out.println("Su nombre \"" + nombre + "\" contiene las vocales " + resultado);
	}

	public void tresenraya() {
		/*
		 * int numero = (int) (Math.random() * 50) + 1; System.out.println(numero);
		 */

		String[][] tablero = new String[3][3];
		String jugador;
		String caracter;
		ImprimirArreglo(vaciartabla(tablero));
		for (int i = 0; i < 9; i++) {
			int numero = i;
			if (numero % 2 == 0) {
				jugador = "Jugador 1";
				caracter = "x";
				boolean estado = validar_ingreso_dato(tablero, jugador, caracter);
				while (estado == false) {
					System.out.println("Ese campo esta ocupado vuelve a jugar el  jugador : " + jugador);
					estado = validar_ingreso_dato(tablero, jugador, caracter);
				}
			} else {
				jugador = "Jugador 2";
				caracter = "o";
				boolean estado = validar_ingreso_dato(tablero, jugador, caracter);
				while (estado == false) {
					System.out.println("Ese campo esta ocupado vuelve a jugar el  jugador : " + jugador);
					estado = validar_ingreso_dato(tablero, jugador, caracter);
				}

			}

		}

	}

	public static boolean validar_ingreso_dato(String[][] tablero, String jugador, String caracter) {
		int fila;
		int columna;
		Scanner teclado = new Scanner(System.in);
		System.out.println(jugador);
		System.out.print("ingrese fila : ");
		fila = teclado.nextInt();
		System.out.print("ingrese columna : ");
		columna = teclado.nextInt();
		if (tablero[fila - 1][columna - 1] == "_") {
			tablero[fila - 1][columna - 1] = caracter;
			ImprimirArreglo(tablero);
			return true;
		} else {
			return false;
		}
	}

	public String[][] vaciartabla(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[j][i] = "_";
			}	
			
		}
		return tablero;
	}

	public static void ImprimirArreglo(String[][] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				System.out.print(arreglo[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void ImprimirArreglo(int[] arreglo) {
		System.out.print("[");
		for (int i = 0; i < arreglo.length; i++) {
			if (i == arreglo.length - 1) {
				System.out.print(arreglo[i]);
			} else {
				System.out.print(arreglo[i] + ",");
			}
		}
		System.out.print("]");
	}

}
