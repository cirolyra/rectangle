package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle retangulo = new Rectangle();

		System.out.println("Enter rectangle Width: ");
		retangulo.width = sc.nextDouble();
		System.out.println("Enter rectangle Height: ");
		retangulo.height = sc.nextDouble();

		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimeter());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

		sc.close();
	}

}
