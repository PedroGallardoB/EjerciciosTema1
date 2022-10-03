package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
double num1;
double num2;
boolean res;

Scanner sc = new Scanner(System.in);

System.out.println("Introduzca dos números para ver si son iguales");

num1=sc.nextDouble();
num2=sc.nextDouble();

res = (num1==num2)?true:false;
System.out.println(res);

sc.close();
	}

}
