package hw3JavaVariablesDeclared;

public class AboutMe {
	String myHobby;// variable declared
	int myAge;
	float myHeight;
	char myGender;
	boolean iAmBengali;
	byte rollNumber;
	short mobilePrice;
	long birthYear;
	double mykidneyPrice;

	public AboutMe() { // constructor declared
		System.out.println(" ------------ This is all about Myself -----------");
	}

	public void aboutMe() {//method implemented
		System.out.println("My hobby: " + myHobby + "\nMy Age: " + myAge + "\nMy Gender:" + myGender +
				"\nMy Height:"
				+ myHeight + "\nI am from Bangladesh: " + iAmBengali + "\nMy roll:" + rollNumber + 
				"\nMy mobile price:" + mobilePrice + "\nBirth year:" + birthYear +
				"\nMy kidney price:" + mykidneyPrice);
	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();// constructor initialized
		aboutMe.aboutMe();

		
	}
	
}