package Exercise2;
import java.util.Scanner;

public class Main {
	public static boolean isPrime(int number) {
		
		if(number < 2) {
			return false;
		}
		
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int upperLimit = sc.nextInt();
		sc.close();
		int sum = 0;
		int i = 2;
		System.out.print(upperLimit + " -> ");
		while(sum <= upperLimit) {
			if(isPrime(i)) {
				sum += i;
				if(sum <= upperLimit) {
					System.out.print(sum + " ");
					
				}
			}i++;
		}
		
		
	}

}
