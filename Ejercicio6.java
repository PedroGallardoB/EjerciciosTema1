package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int segundos;
		int minutos;
		int horas;
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Introduzca los segundos para convertir a minutos y horas");
	segundos = sc.nextInt();
	
	minutos = segundos>=60?segundos/60:0;
	horas = minutos>=60?minutos/60:0;
	
	System.out.println("Son " + horas + " horas,"+ minutos + " minutos, y " + segundos + "segundos");
	sc.close();
		}

	}
