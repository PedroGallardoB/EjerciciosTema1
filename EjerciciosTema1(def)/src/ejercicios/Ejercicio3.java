package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio3 {
	public static void main(String[] args) {

		int número1;// Variable que almacena el primer valor que introduce el usuario
		int número2;// Variable que almacena el segundo valor que introduce el usuario
		int auxiliar;// Variable que almacena el número que habrá que sumar mientras no sea cero o
						// múltiplo de 7
		int resultado;// Variable que tendrá el resultado final
		Scanner sc = new Scanner(System.in); // Nombramos el escáner que llamamos

		System.out.println("Por favor introduzca un número entero.");// Pedimos al usuario que introduzca un número

		número1 = sc.nextInt();// Leemos el primer número

		System.out.println(
				"Por favor introduzca otro número entero para comprobar cuanto hay que sumar para que sea múltiplo del primero.");// Pedimos
																																	// al
																																	// usuario
																																	// que
																																	// introduzca
																																	// otro
																																	// número

		número2 = sc.nextInt();// Leemos el segundo número

		auxiliar = número2 - (número1 % 7);// Operamos para guardar en auxiliar el número que habrá que sumar mientras
											// no sea cero o múltiplo de siete
		resultado = (número1 % número2) == 0 ? 0 : auxiliar;// Empleamos ternarios para que si es múltiplo de 7 el
															// número introducido muestre que hay que sumar cero en
															// lugar de siete
		resultado = número1 == 0 ? número2 : resultado;// Empleamos ternarios para que si el usuario introduce cero el
														// programa muestre que habrá que sumar siete

		System.out.println(
				"Tiene que sumar " + resultado + " al primero para que el resultado sea múltiplo del segundo.");// Imprimimos
																												// el
																												// resultado
		sc.close();// Cerramos el escáner
	}

}