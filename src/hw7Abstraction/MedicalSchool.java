package hw7Abstraction;

public abstract class MedicalSchool {
	
	public abstract void anatomyLab();//abstract method.
	
	public void biochemistryLab() {//non abstract method.
		System.out.println("Organic chemistry is a mejor course of biochemistry");
		
	}
public MedicalSchool() {//Default Constructor
	System.out.println("she start go to medical school");
}
}
