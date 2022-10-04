package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio5 {

	public static void main(String[] args) {

	double a;//Variable para almacenar dato que guarda el usuario con el que operaremos
	double b;//Variable para almacenar dato que guarda el usuario con el que operaremos 
	double c;//Variable para almacenar dato que guarda el usuario con el que operaremos
	double x;//Variable para almacenar dato que guarda el usuario con el que operaremos
	double y;//Variable para almacenar dato que guarda el usuario con el que operaremos
	
	Scanner sc= new Scanner (System.in); //Nombramos al escáner
		
	
System.out.println("Este es un programa para despejar y=ax^2+bx+c ");//Explicamos el funcionamiento de la aplicación al usuario

System.out.println("Por favor introduzca el valor de a");//Pedimos el valor de a
a = sc.nextDouble();//Leemos el valor de a y lo guardamos en una variable
System.out.println("Por favor introduzca el valor de b");//Pedimos el valor de b
b = sc.nextDouble();//Leemos el valor de b y lo guardamos en una variable
System.out.println("Por favor introduzca el valor de c");//Pedimos el valor de c
c = sc.nextDouble();//Leemos el valor de c y lo guardamos en una variable
System.out.println("Por favor introduzca el valor de x");//Pedimos el valor de x
x = sc.nextDouble();//Leemos el valor de x y lo guardamos en una variable

y=(a*x*x)+(b*x)+c;//Operamos con los datos que pedimos anteriormente para obtener el valor de y

System.out.println("El valor de y sería " + y);//Mostramos el resultado al usuario
sc.close();//Cerramos el escáner
	}

}
