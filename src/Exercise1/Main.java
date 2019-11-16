package Exercise1;

public class Main {
	
	public static int getMultipleOf5(int number) {
		return (number / 5) * 5;
	}
	
	public static void main(String[] args) {
		System.out.println("getMultipleOf5(20) -> " + getMultipleOf5(20));
		System.out.println("getMultipleOf5(18) -> " + getMultipleOf5(18));
		System.out.println("getMultipleOf5(1) -> " + getMultipleOf5(1));
		System.out.println("getMultipleOf5(4) -> " + getMultipleOf5(4));
		System.out.println("getMultipleOf5(11) -> " + getMultipleOf5(11));
	}
}
