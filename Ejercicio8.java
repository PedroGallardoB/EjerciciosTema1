package ejercicios;

import java.util.Scanner; //Importamos el esccáner

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numAdulto;
		int numNin;
		double descuento;
		double total;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el número de entradas de adulto");
		numAdulto = sc.nextInt();
		System.out.println("Introduzca el número de entradas de niño");
		numNin = sc.nextInt();
		
		total = numNin*15.5 + numAdulto*20;
		descuento = total >=100?total - (total*5/100):total;
	
		System.out.println("El precio final son " + descuento + " euros");
		sc.close();
	}

}
