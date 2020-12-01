package desafios3;

import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero \n");
		int nummin = sc.nextInt();
		System.out.println("Ingrese otro numero \n");
		int nummax = sc.nextInt();
		int i;
		int suma = 0; //acumulador
		sc.close();	
	

		for (i=nummin; i<=nummax; i++){
			if (i % 2 == 1) {
			suma += i;}
		}
		System.out.printf("%d\n", suma);
		
		
	
	}

}
