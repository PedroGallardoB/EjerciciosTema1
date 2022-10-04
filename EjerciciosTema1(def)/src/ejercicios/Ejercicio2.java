package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio2 {

	public static void main(String[] args) {

		int número;// Variable que almacena el valor que introduce el usuario
		int auxiliar;// Variable que almacena el número que habrá que sumar mientras no sea cero o
						// múltiplo de 7
		int resultado;// Variable que tendrá el resultado final
		Scanner sc = new Scanner(System.in); // Nombramos el escáner que llamamos

		System.out.println(
				"Por favor introduzca un número entero para comprobar cuanto hay que sumar para que el número se múltiplo de 7");// Pedimos
																																	// al
																																	// usuario
																																	// que
																																	// introduzca
																																	// un
																																	// número

		número = sc.nextInt();// Leemos el número
		auxiliar = 7 - (número % 7);// Operamos para guardar en auxiliar el número que habrá que sumar mientras no
									// sea cero o múltiplo de siete
		resultado = (número % 7) == 0 ? 0 : auxiliar;// Empleamos ternarios para que si es múltiplo de 7 el número
														// introducido muestre que hay que sumar cero en lugar de siete
		resultado = número == 0 ? 7 : resultado;// Empleamos ternarios para que si el usuario introduce cero el programa
												// muestre que habrá que sumar siete

		System.out.println("Tiene que sumar " + resultado + " para que el resultado sea múltiplo de 7.");// Imprimimos
																											// el
																											// resultado
		sc.close();// Cerramos el escáner
	}

}
