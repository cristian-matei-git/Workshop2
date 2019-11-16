package Algoritmi;

public class MagicNumber2 {
	
	public int sumOfDigits(int number) {
		
		int lastDigit = 0;
		int sum = 0;
		
		while(number != 0) {
			lastDigit = number % 10;
			sum += lastDigit;
			number /= 10;
		}
		return sum;
	}
	
	public boolean isMagic(int number) {
		
		while(sumOfDigits(number) > 9) {
			number = sumOfDigits(number);
		}
		if(sumOfDigits(number) == 3 || sumOfDigits(number) == 7 || sumOfDigits(number) == 9) {
			return true;
		}
		return false;
	}

}
