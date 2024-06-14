package hw13Polymorphism;

public class Niece extends Sister {

	// void type method
	@Override
	public void sister() {
		System.out.println("This is a void type method from Niece Class");
	}

	// void type parameterized method
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 / 5 + age2 + 500 * 3 + age3 + Integer.parseInt(age4) + age5 + age6 + 52368;
		System.out.println("Total age of Sister: " + total1);
	}

	// return type parameterized method
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 - 25 + age2 / 7 + age3 * 7500;
		System.out.println("Total age of Sister: " + total2);
		return total2;
	}
	 
	
	/*
	 * Static method can't override or implemented because static is a local method of a class.
	 * If we remove override annotation, it will work as static method of this Niece Class.
	 */	 
	 
	/*
	 * static method
	 * @Override 
	 * static type method public static int sister(int age1, int age2, String age4) { 
	 * int total3 = age1 + age2 + Integer.parseInt(age4);
	 * System.out.println("Total age of Sister: " + total3); return total3;
	 * }
	 */

	
	/*
	 * Final method can't be overridden because once it's final, we can't change or orveride anything
	 */
	/*
	 * final type method
	 * @Override 
	 * public final int sister(int age5, String age4, int age6) {
	 * int total4 = age5 + Integer.parseInt(age4) + age6;
	 * System.out.println("Total age of Sister: " + total4); return total4; }
	 */	

}
