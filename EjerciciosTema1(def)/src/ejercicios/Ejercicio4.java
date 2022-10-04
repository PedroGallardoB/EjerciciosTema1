package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio4 {

	public static void main(String[] args) {

		double base;// Variable donde almacenaremos la longitud de la base del triángulo
		double altura;// Variable donde almacenaremos la altura del triángulo
		double resultado;// Variable donde operaremos para obtener el área del triángulo
		Scanner sc = new Scanner(System.in);// Nombramos al escáner

		System.out.println("Introduzca la longitud de la base del triángulo del que desee averiguar su área");// Solicitamos
																												// la
																												// longitud
																												// de la
																												// base
																												// del
																												// triángulo
																												// al
																												// usuario
		base = sc.nextDouble();// Leemos la longitud de la base del triángulo

		System.out.println("Introduzca la altura del triángulo del que desee averiguar su área");// Solicitamos la
																									// altura del
																									// triángulo al
																									// usuario
		altura = sc.nextDouble();// Leemos la altura del triángulo

		resultado = (base * altura) / 2;// Operamos con los datos aplicando la fórmula del área del triángulo y
										// obtenemos el resultado

		System.out.println("El área del triángulo es de " + resultado + " unidades cuadradas.");// Imprimimos el
																								// resultado en pantalla
		sc.close();// Cerramos el escáner
	}
}
