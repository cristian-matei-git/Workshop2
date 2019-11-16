package Algoritmi;

public class MagicNumber {
	
	public boolean isMagic(int number) {
		
		int magic = number;
		int lastDigit = 0;
		int sum = 0;
		
		if(number == 3 || number == 7 || number == 9) {
			return true;
		}
		
		while((number != 3 && number != 7 && number != 9) && magic != 0) {
			
			if((sum == 3 || sum == 7 || sum == 9) && magic / 10 == 0) {
				return true;
					
				}
			
			lastDigit = magic % 10;
			sum += lastDigit;
			magic /= 10;
			
			if(magic / 10 == 0) {
				sum = sum + magic;
				if(sum >= 10) {
					magic = sum;
					sum = 0;
				}
			}
			
		}
		if(sum == 3 || sum == 7 || sum == 9) {
			return true;
		}
		return false;
	}
	

}
