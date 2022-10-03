package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio10 {

	public static void main(String[] args) {
	
		double metros;
		int centímetros;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca los metros que recorrió el algoritmo al ser lanzado");
		metros = sc.nextDouble();
		
		centímetros = (int)(metros*100);
		System.out.println(centímetros);
		sc.close();
	}

}
