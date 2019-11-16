package Exercise4;

public class Main {
	
	public static void printPitagora(int upperLimit) {
		for(int a = 1; a <= upperLimit; a++) {
			for(int b = a; b<= upperLimit; b++) {
				for(int c=b;  c <= upperLimit; c++) {
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("upperLimit == 30");
		printPitagora(30);
	}

}
