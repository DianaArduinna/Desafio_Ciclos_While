package desafios3;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Ingrese un numero \n");
		int numinput = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		
		int i=1;
        
		while(i<=numinput)
        {
            System.out.printf("%d \n",num1);
            int sumAnt = num1 + num2;
            num1 = num2;
            num2 = sumAnt;
            i++;
        }
		sc.close();
	}

}
