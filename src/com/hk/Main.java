package com.hk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double cantidad;
		int $100;
		int $50;
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
		}
		
		
		
		cantidad = sc.nextDouble();
		
		sc.close();
	}

}
