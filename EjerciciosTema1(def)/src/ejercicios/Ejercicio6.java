package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio6 {

	public static void main(String[] args) {

	
		int segundos;//Guardamos la cantidad de segundos introducidos y guardará los segundos tras la conversión
		int minutos;//Guarda la cantidad de minutos
		int horas;//Guarda la cantidad de horas
		
		Scanner sc = new Scanner(System.in);//Nombramos el escáner
		
	System.out.println("Introduzca los segundos para convertir a segundos, minutos y horas");//Pedimos los segundos al usuario y explicamos el programa
	segundos = sc.nextInt();//Leemos los segundos 
	horas = segundos/3600; //Convertimos segundos a horas
	minutos = (segundos % 3600)/60; //Convertimos segundos a minutos con el resto de la operación anterior
	segundos = (segundos % 60);//Los segundos serán el resto de dividir el total de ellos entre 60 (pasar a minutos)
	
	System.out.println("Son " + horas + " horas,"+ minutos + " minutos, y " + segundos + " segundos"); //Mostramos el resultado
	sc.close();//Cerramos el escáner
		}

	}
