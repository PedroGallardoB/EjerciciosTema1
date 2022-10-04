package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio9 {
	public static void main(String[] args) {
		
double num1;//Variable para guardar el primer número
double num2;//Variable para guardar el segundo número
boolean res;//Variable para guardar el resultado

Scanner sc = new Scanner(System.in);//Nombramos el escáner

System.out.println("Introduzca dos números para ver si son iguales");//Pedimos dos números al usuario

num1=sc.nextDouble();//Leemos el primer número
num2=sc.nextDouble();//Leemos el segundo número

res = (num1==num2)?true:false;//Comprobamos con un ternario si los números son iguales
System.out.println("Los números son iguales? " + res);//Mostramos el resultado

sc.close(); //Cerramos el escáner
	}

}
