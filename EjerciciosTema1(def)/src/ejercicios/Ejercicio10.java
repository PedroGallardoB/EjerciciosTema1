package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio10 {

	public static void main(String[] args) {

		double metros;// Declaramos la variable metro, que será la que introducirá el usuario
		int centímetros;// La variable mostrará los centímetros tras la conversión que realizará el
						// programa
		Scanner sc = new Scanner(System.in); // Nombramos al escáner

		System.out.println("Introduzca los metros que recorrió el algoritmo al ser lanzado"); // Pedimos al usuario que
																								// introduzca los metros
																								// recogidos
		metros = sc.nextDouble();// Leemos y almacenamos los metros que recorre el algoritmo

		centímetros = (int) (metros * 100);// Convertimos de cm a m y hacemos un cast a int para que no sea un número
											// decimal
		System.out.println("El algoritmo recorre " + centímetros + "cm");// Imprimimos el resultado para el usuario
		sc.close();// Cerramos el escáner
	}

}
