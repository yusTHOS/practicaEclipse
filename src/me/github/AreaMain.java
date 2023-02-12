package me.github;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dame el radio 1 :");
		double radio1 = Double.parseDouble(entrada.nextLine());

		System.out.print("Dame el radio 2 :");
		double radio2 = Double.parseDouble(entrada.nextLine());

		
		/*
		Corona corona = new Corona (new Cercle(radio1), new Cercle(radio2));
		
		System.out.printf("L'area de la corona es %.2f", corona.c1.radi, corona.c2.radi, corona.getArea());
		*/
		double areaCorona = areaCorona(radio1, radio2);
		System.out.printf("El area es %.02f ", areaCorona);

		entrada.close();

	}
		/*****/
		private static double areaCercle (double radio) {
				return Math.PI * radio * radio;
			
		}
		
		/*****/
		private static double areaCorona (double radio1, double radio2) {
			return Math.abs(areaCercle(radio1) - areaCercle(radio2));
		}
		
		
		
}