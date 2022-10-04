package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int numAdulto;//Variable que almacena la cantidad de entradas de adulto
		int numNin;//Variable que almacena la cantidad de entradas de niño
		double descuento;//Variable que guardará el resultado del ternario qur aplica el descuento
		double total;//Variable que almacena el precio total de entradas sin descuento
		Scanner sc= new Scanner(System.in);//Nombramos al escáner
		
		System.out.println("Introduzca el número de entradas de adulto");//Solicitamos al usuario intoducir la cantidad de entradas de adulto
		numAdulto = sc.nextInt();//Leemos la cantidad de entradas de adulto
		System.out.println("Introduzca el número de entradas de niño");//Solicitamos al usuario intoducir la cantidad de entradas de niño
		numNin = sc.nextInt();//Leemos la cantidad de entradas de niño
		
		total = numNin*15.5 + numAdulto*20;//Calculamos el precio total sin descuento
		descuento = total >=100?total - (total*5/100):total;//Con un ternario aplicamos el descuento solo si el precio es igual o menor a 100 euros
	
		System.out.println("El precio final son " + descuento + " euros");//Imprimimos el resultado
		sc.close();//Cerramos el escáner
	}

}
