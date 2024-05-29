package hw5JavaMethods;

public class FullName {
	public String fullName(String fName,String lname) {
		System.out.println("Family Members:"+fName+lname );
		return null;
	}
	public static void main(String[] args) {
		FullName name=new FullName();
		name.fullName("Saimum","maria");
		name.fullName("Khadija", "Saniya");
		name.fullName("Tania", "Fatema");
	}
}
