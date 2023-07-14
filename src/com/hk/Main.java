package com.hk;

import java.util.Scanner;

public class Main {

	static double cantidad;
	static double cantidadActual;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int $100 = 0;
		int $20 = 0;
		int $10 = 0;
		int $5 = 0;
		int $1 = 0;
		int $0_25 = 0;
		int $0_10 = 0;
		int $0_05 = 0;
		int $0_01 = 0;
		
		int opcion = 0;
		
		while(true){
			System.out.println("Elige la opcion:");
			System.out.println("1. Calcular cambio");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			
			if(opcion == 2) {
				break;
			}
			
			System.out.println("Introduce la cantidad:");
			cantidad = sc.nextDouble();
			cantidadActual = cantidad;
			
			$100 = calcularBilletes$100();
			$20 = calcularBilletes$20();
			$10 = calcularBilletes$10(cantidad);
			$5 = calcularBilletes$5(cantidad);
			$1 = calcularBilletes$1(cantidad);
			
			System.out.println("El minimo cambio de dolares para $" + cantidad + " es:");
			System.out.println($100 + " billetes de cien - $100");
			System.out.println($20 + " billetes de veinte - $20");
			System.out.println($10 + " billetes de diez - $10");
			System.out.println($5 + " billetes de cinco - $5");
			System.out.println($1 + " billetes de uno - $1");
			
			$100 = 0;
			$20 = 0;
			$10 = 0;
			$5 = 0;
			$1 = 0;
			$0_25 = 0;
			$0_10 = 0;
			$0_05 = 0;
			$0_01 = 0;
		}
		
		
		
		cantidad = sc.nextDouble();
		
		sc.close();
	}

	private static int calcularBilletes$1(double cantidad) {
		int $1 = (int) ((cantidadActual) / 1.0);
		double restante = cantidadActual % 1.0;
		cantidadActual = restante;
		
		return $1;
	}

	private static int calcularBilletes$5(double cantidad) {
		int $5 = (int) ((cantidadActual) / 5.0);
		double restante = cantidadActual % 5.0;
		cantidadActual = restante;
		
		return $5;
	}

	private static int calcularBilletes$10(double cantidad) {
		int $10 = (int) ((cantidadActual) / 10.0);
		double restante = cantidadActual % 10.0;
		cantidadActual = restante;
		
		return $10;
	}

	static int calcularBilletes$20() {
		int $20 = (int) ((cantidadActual) / 20.0);
		double restante = cantidadActual % 20.0;
		cantidadActual = restante;
		
		return $20;
	}

	static int calcularBilletes$100() {
		int $100 = (int) ((cantidadActual) / 100.0);
		double restante = cantidadActual % 100.0;
		cantidadActual = restante;
		
		return $100;
	}
}
