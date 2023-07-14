package com.hk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cantidad;
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
			
			$100 = calcularBilletes$100(cantidad);
			$20 = calcularBilletes$20(cantidad);
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
		double restante = cantidad % 100.0;
		int $100 = (int) ((cantidad - restante) / 100.0);
		return $100;
	}

}
