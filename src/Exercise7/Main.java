package Exercise7;

public class Main {
	
	public static long sum(long n) {
		
		long suma = 0;
		
		for(long i = 1; i <= n; i++) {
			suma += Math.pow(i, 2); 
			
			suma %= 1_000_000_000L;
				
			
		}
		return suma;
	}
	

	public static void main(String[] args) {
		
		System.out.println(sum(24));
		System.out.println(sum(197));
		System.out.println(sum(1_120_878));
		System.out.println(sum(1_123_432_878));

	}

}
