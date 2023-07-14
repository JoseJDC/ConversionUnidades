package com.hk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cantidad;
		int $100;
		int $20;
		int $10;
		int $5;
		int $1;
		int $0_25;
		int $0_10;
		int $0_05;
		int $0_01;
		
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
			
			$100 = calcularBilletes$100(cantidad);
			$20 = calcularBilletes$20(cantidad);
			$10 = calcularBilletes$10(cantidad);
			$5 = calcularBilletes$5(cantidad);
			$1 = calcularBilletes$1(cantidad);
		}
		
		
		
		cantidad = sc.nextDouble();
		
		sc.close();
	}

	private static int calcularBilletes$1(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int calcularBilletes$5(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int calcularBilletes$10(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	static int calcularBilletes$20(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	static int calcularBilletes$100(double cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

}
