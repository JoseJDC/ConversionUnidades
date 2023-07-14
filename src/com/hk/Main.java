package com.hk;

import java.util.Scanner;

public class Main {

	// Cantidad ingresada por el usuario
	static double cantidad;
	// Cantidad que disminuye con cada billete que se calcula
	static double cantidadActual;

	public static void main(String[] args) {

		// Creo el Scanner para capturar entrada de datos
		Scanner sc = new Scanner(System.in);

		// Inicializo todas las varibles que representa cada billete
		int $100 = 0;
		int $20 = 0;
		int $10 = 0;
		int $5 = 0;
		int $1 = 0;
		int $0_25 = 0;
		int $0_10 = 0;
		int $0_05 = 0;
		int $0_01 = 0;

		// Variable de usuario
		int opcion = 0;

		while (true) {
			System.out.println("Elige la opcion:");
			System.out.println("1. Calcular cambio");
			System.out.println("2. Salir");
			opcion = sc.nextInt();

			// Salir del sistema
			if (opcion == 2) {
				break;
			}

			// Se asigna la catidad ingresada por el usuario
			System.out.println("Introduce la cantidad:");
			cantidad = sc.nextDouble();
			cantidadActual = cantidad;

			// Se calculan todos lo billetes con metodos especificos (Logica antigua)
			// $100 = calcularBilletes$100();
			// $20 = calcularBilletes$20();
			// $10 = calcularBilletes$10();
			// $5 = calcularBilletes$5();
			// $1 = calcularBilletes$1();
			// $0_25 = calcularMoneda$0_25();
			// $0_10 = calcularMoneda$0_10();
			// $0_05 = calcularMoneda$0_05();
			// $0_01 = calcularMoneda$0_01();

			// Se calculan todos lo billetes con un solo metodo
			$100 = calcularCantidad$$$(100);
			$20 = calcularCantidad$$$(20);
			$10 = calcularCantidad$$$(10);
			$5 = calcularCantidad$$$(5);
			$1 = calcularCantidad$$$(1);
			$0_25 = calcularCantidad$$$(0.25);
			$0_10 = calcularCantidad$$$(0.10);
			$0_05 = calcularCantidad$$$(0.05);
			$0_01 = calcularCantidad$$$(0.01);

			// Se imprimen en pantalla los billetes
			System.out.println("El minimo cambio de dolares para $" + cantidad + " es:");
			System.out.println($100 + " billetes de cien - $100");
			System.out.println($20 + " billetes de veinte - $20");
			System.out.println($10 + " billetes de diez - $10");
			System.out.println($5 + " billetes de cinco - $5");
			System.out.println($1 + " billetes de uno - $1");
			System.out.println($0_25 + " monedas de veinticinco - $0.25");
			System.out.println($0_10 + " monedas de diez - $0.10");
			System.out.println($0_05 + " monedas de cinco - $0.05");
			System.out.println($0_01 + " monedas de uno - $0.01");

			// Se reinician los billetes para una nueva posible cantidad
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
		sc.close();
	}

	private static int calcularCantidad$$$(double valor) {
		int $$$ = (int) ((cantidadActual) / valor); // Calculo la cantidad de monedas
		double restante = cantidadActual % valor; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $$$;
	}

	private static int calcularMoneda$0_01() {
		int $0_01 = (int) ((cantidadActual) / 0.01); // Calculo la cantidad de monedas
		double restante = cantidadActual % 0.01; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $0_01;
	}

	private static int calcularMoneda$0_05() {
		int $0_05 = (int) ((cantidadActual) / 0.05); // Calculo la cantidad de monedas
		double restante = cantidadActual % 0.05; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $0_05;
	}

	private static int calcularMoneda$0_10() {
		int $0_10 = (int) ((cantidadActual) / 0.10); // Calculo la cantidad de monedas
		double restante = cantidadActual % 0.10; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $0_10;
	}

	private static int calcularMoneda$0_25() {
		int $0_25 = (int) ((cantidadActual) / 0.25); // Calculo la cantidad de monedas
		double restante = cantidadActual % 0.25; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $0_25;
	}

	private static int calcularBilletes$1() {
		int $1 = (int) ((cantidadActual) / 1.0); // Calculo la cantidad de billetes
		double restante = cantidadActual % 1.0; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $1;
	}

	private static int calcularBilletes$5() {
		int $5 = (int) ((cantidadActual) / 5.0); // Calculo la cantidad de billetes
		double restante = cantidadActual % 5.0; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $5;
	}

	private static int calcularBilletes$10() {
		int $10 = (int) ((cantidadActual) / 10.0); // Calculo la cantidad de billetes
		double restante = cantidadActual % 10.0; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $10;
	}

	private static int calcularBilletes$20() {
		int $20 = (int) ((cantidadActual) / 20.0); // Calculo la cantidad de billetes
		double restante = cantidadActual % 20.0; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $20;
	}

	private static int calcularBilletes$100() {
		int $100 = (int) ((cantidadActual) / 100.0); // Calculo la cantidad de billetes
		double restante = cantidadActual % 100.0; // Calculo el restante para el siguiente metodo
		cantidadActual = Math.round(restante * 100.00) / 100.00; // Redondeo para futuros metodos

		return $100;
	}
}
