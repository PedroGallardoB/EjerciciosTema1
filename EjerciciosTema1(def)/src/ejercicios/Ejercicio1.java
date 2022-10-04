package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
	double número; //En esta variable guardaremos el valor que introducirá el cliente.
	int auxiliar; //Esta variable será empleada como una auxiliar con la que operaremos una suma y haremos un cast.

	//Nombramos al escáner que importamos.
	
	Scanner sc = new Scanner(System.in); 
	
	//Codificamos el proceso
	
	System.out.println("Introduzca un número con decimales para redondear a entero."); //Imprimimos las intrucciones al usuario en pantalla.

	número = sc.nextDouble(); //Leemos el número que introduzca el usuario.
	
	auxiliar = (int) (número + 0.5); //Sumamos 0.5 y hacemos cast a número entero quedándonos con la cifra entera, que en caso de que el primer decimal fuera 5 o mayor se redondeará a la siguiente cifra.
	
	
	//Imprimimos el resultado
	
	System.out.println("El número redondeado es " + auxiliar);
	
	//Cerramos el escáner
	
	sc.close();
	
	
	}

}
