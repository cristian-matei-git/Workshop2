package Exercise6;

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
	
	public static int largestPrimeFactor(int number) {
		
		
		for(int i = number/2 ; i >= 2; i--) {
			if(number % i == 0 && isPrime(i)) {

				return i;
			
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println(largestPrimeFactor(5));
		System.out.println(largestPrimeFactor(21));
		System.out.println(largestPrimeFactor(343965));
		System.out.println(largestPrimeFactor(45));
		System.out.println(largestPrimeFactor(60));
		System.out.println(largestPrimeFactor(408));
	}

}
