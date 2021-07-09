package Main;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("////Calculadora solo division con numeros naturales////");
		System.out.println("ingrese primer numero diferente de 0");
		int A = sc.nextInt();
		System.out.println("ingrese segundo numero difernte de 0 ");
		int B = sc.nextInt();
		int R = A/B;
		System.out.println("RESULTADO ES " +R);

	}


}


	
	
