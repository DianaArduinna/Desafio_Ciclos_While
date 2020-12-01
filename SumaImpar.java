package desafios3;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero \n");
		int n = sc.nextInt();
		int i = 0;
		int suma = 0; //acumulador

		while (i < n) {
			i += 1;
			if (i % 2 == 1) {
			suma += i;}
		}
		System.out.printf("%d\n", suma);
		
		sc.close();
	}
}

