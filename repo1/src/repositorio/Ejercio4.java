package repositorio;

public class Ejercio4 {
	public Ejercio4() {

		System.out.println("holaa");

		String testString = "Marko Manrique";
		char[] stringToCharArray = testString.toCharArray();
		int total = 0;
		String nombre = "";

		for (char output : stringToCharArray) {
			// System.out.print(output);
			total++;

			if (Character.isUpperCase(output))

			{

				// System.out.println(output.toLowerCase());
				// System.out.println("Mayuscula");

				nombre += Character.toLowerCase(output);

				// nombre+=output;

			}

			else {

				// System.out.println(output.toLowerCase());
				// System.out.println("Minuscula");
				nombre += Character.toUpperCase(output);
				// nombre+=output;
			}

		}

		System.out.println(nombre);

		String Invertida = "";
		for (int x = nombre.length() - 1; x >= 0; x--)
			Invertida = Invertida + nombre.charAt(x);
		System.out.println(Invertida);
	}
}
