package Algoritmi;

public class Main {

	public static void main(String[] args) {
		
		MagicNumber magic = new MagicNumber();
		
		System.out.println(magic.isMagic(22971));
		System.out.println(magic.isMagic(21));
		System.out.println(magic.isMagic(3));
		System.out.println(magic.isMagic(1234));
		
		MagicNumber2 magic2 = new MagicNumber2();
		
		System.out.println(magic2.isMagic(22971));
		System.out.println(magic2.isMagic(21));
		System.out.println(magic2.isMagic(3));
		System.out.println(magic2.isMagic(1234));

	}

}
