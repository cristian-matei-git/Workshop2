package Exercise5;

public class Main {
	
	public static int numberOfDigits(int number, int digit) {
		
		int counter = 0;
		
		for(int i = 0; i <= number; i++) {
			
			while(number != 0) {
				
				if(number % 10 == digit) {
					
					++counter;
				}
				number /= 10;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println(numberOfDigits(12321, 1));
		System.out.println(numberOfDigits(4823, 0));
		System.out.println(numberOfDigits(1000, 0));
	}

}
