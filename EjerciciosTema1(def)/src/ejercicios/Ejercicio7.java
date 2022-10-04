package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio7 {

	public static void main(String[] args) {

		double mm;//Almacena los milímetros introducidos
		double cm;//Almacena los centímetros que introducidos
		double m;//Almacena los metros introducidos
		double total;//Variable en la que sumaremos todo y convertiremos a centímetrps
		
	Scanner sc = new Scanner(System.in);//Nombramos al escáner
	
	System.out.println("Introduzca una medida en mm");//Pide al usuario que introduzca una medida en mm.
	mm = sc.nextDouble();//Leemos la medida en mm.
	System.out.println("Introduzca una medida en cm");//Pide al usuario que introduzca una medida en cm.
	cm = sc.nextDouble();//Leemos la medida en cm.
	System.out.println("Introduzca una medida en m");//Pide al usuario que introduzca una medida en m.
	m = sc.nextDouble();//Leemos la medida en m.
	
	total = mm/10 + cm + m*100;//Convertimos todo a centímetros
	
	System.out.println("El total son "+ total + " centímetros");//Imprimimos el resultado en pantalla
	sc.close();//Cerramos el escáner
	
	}

}
