package hw13Polymorphism;

public class Sister {

	/*
	 * Method overloading - When different method exist with same name but with
	 * different parameter or different combination of parameter is called method
	 * overloading. Method overloading occurs during compile time.
	 * Method overloading also called early binding or static binding.
	 */

	// void type method
	public void sister() {
		System.out.println("This is a void type method from Sister Classs");
	}

	// void type parameterized method
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age of Sister: " + total1);
	}

	// return type parameterized method
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age of Sister: " + total2);
		return total2;
	}

	// static type method
	public static int sister(int age1, int age2, String age4) {
		int total3 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age of Sister: " + total3);
		return total3;
	}

	// final type method
	public final int sister(int age5, String age4, int age6) {
		int total4 = age5 + Integer.parseInt(age4) + age6;
		System.out.println("Total age of Sister: " + total4);
		return total4;
	}

}
