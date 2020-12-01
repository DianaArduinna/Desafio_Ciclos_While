package desafios3;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero ");
		int n = sc.nextInt();
		int i = 0;
		int j = 0;
		
		while (j<n) {
			
			if(i%2==0) {
				System.out.printf("%d\n",i);
				j+=1;
			} 
			i++;
		}
		
		
		sc.close();
	}

}
