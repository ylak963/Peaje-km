package es.studium.Peaje;

import java.util.Scanner;

public class Peaje {

	public static void main(String[] args) 
	{
		float km,ton;
		int option=1;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Indicar el número correspondiente al vehiculo que desea consultar:");
			System.out.println("--------------------");
			System.out.println("     MENU");
			System.out.println("-------------------");
			System.out.println(" 1.Moto");
			System.out.println(" 2.Coche");
			System.out.println(" 3.Camión");
			System.out.println(" 4.Autobus");
			option=teclado.nextInt();


			System.out.println("Indicar los km:");
			km=teclado.nextFloat();

			switch(option)
			{
			case 1:
				System.out.println("La cantidad a pagar es: 3,2 €");
				break;

			case 2:
				System.out.println("La cantidad a pagar es:"+0.1*km+"€");
				break;

			case 3:
				System.out.println("Toneladas transportadas:");
				ton=teclado.nextFloat();
				System.out.println("La cantidad a pagar es:"+(km*0.2));
				break;

			case 4:
				System.out.println("La cantidad a pagar es:"+0.2*km+"€");
				break;

			default:
				System.out.println("Los datos introducidos, no son correctos");
				break;

			}
		
		}
		while (option!=5);
		System.out.println("Salir");

		teclado.close();
	}
}

