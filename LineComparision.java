package com.LineComparisionProblem;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the values:");

		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();

		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("length is:" + len1);

	}

}
