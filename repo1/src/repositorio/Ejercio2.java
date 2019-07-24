package repositorio;

import java.util.Scanner;

public class Ejercio2 {
	public Ejercio2() {
		detectarvocales();
		
	}
	public void detectarvocales() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su nombre : ");
		String nombre=teclado.next();
		String  resultado="";
		for (int i = 0; i < nombre.length(); i++) {
			char letra = nombre.charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i'||letra == 'o'||letra == 'u') {
				resultado += letra+",";
			}
		}
		System.out.println("Su nombre \""+nombre+"\" contiene las vocales "+resultado);
	}
}
