package Main;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);
		System.out.println("ingrese su Sueldo:... ");
		int A = numero.nextInt();
		int b = 100;
		int R= A+b;
		int C = 50;
		int H = A+C;
		int F = 50;
		int S = F+A;
		
		if(A<300) {
			System.out.println("Su bonificacion es de 100");
			System.out.println("Se agregado bonificacion con un total de: " +R);
			
		}
		if(A >= 300 && A <=400) {
			System.out.println("Su bonificacion es de 70");
			System.out.println("Se agregado bonificacion con un total de: " +S);
					
		
		}else {
			System.out.println("Su bonificacion es de 50");
			System.out.println("Se agregado bonificacion con un total de: " +H);
				
		}
	
	}
}

		


