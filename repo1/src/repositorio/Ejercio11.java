package repositorio;
import java.util.Scanner;
public class Ejercio11 {
	public Ejercio11() {
		
		// TODO Auto-generated constructor stub
		//Definir un histograma procedimiento() que tome una lista de
		//números enteros e imprima un histograma en la pantalla. Ejemplo:
		//procedimiento([4, 9, 7]) debería imprimir lo siguiente: **** *********
		//*******
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el tamanio del arreglo");
		int tamarreglo = teclado.nextInt();
		
		int arreglo[]= Arreglo(tamarreglo);
		ImprimirArreglo(arreglo);
		ImprimirHistograma(arreglo);
		
	}
	
	//IMPRIMIR HISTOGRAMA
	
	public static void ImprimirHistograma(int []a) {
		for(int i=0; i<a.length;i++) {
			ImprimirLinea(a[i]);
			System.out.print(" ");
		}
	}
	//CONSTRUIR ARREGLO
	public static int[] Arreglo(int a){
		Scanner teclado = new Scanner(System.in);
		int arreglo[]= new int [a];
		for(int i=0;i<a;i++) {
			System.out.println("ingrese el valor de posicion "+"["+i+"]");
			arreglo[i]=teclado.nextInt();
		}
		
	return arreglo;	
	}
	
	//IMPRIMIR ARREGLO
	public static int [] ImprimirArreglo (int[] c) {
		System.out.print("[");
		for(int i = 0 ; i<c.length;i++) {
			System.out.print(c[i]);
			 if (i!=c.length-1) System.out.print(",");
		  }
		
		System.out.println("]");
		return c;
	}
	
	//IMPRIMIR LINEA
	public static void ImprimirLinea(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("*");
			
		}
		
	}

}
