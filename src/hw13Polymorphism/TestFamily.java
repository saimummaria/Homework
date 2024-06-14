package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n........Sister.........\n");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(10,20,30,"40",50,60);
		sister.sister(10,20,30);
		Sister.sister(10,20,"40");
		sister.sister(50,"40",60);
		
		System.out.println("\n........Niece........\n");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(10,20,30,"40",50,60);
		niece.sister(30,"40",60);
		

	}

}
