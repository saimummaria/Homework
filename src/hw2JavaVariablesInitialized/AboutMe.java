package hw2JavaVariablesInitialized;

public class AboutMe {
	String myHobby;// variable declared
	String myName = "Maria"; // variable initialized
	int myAge = 21;
	float myHeight = 5.6f;
	char myGender = 'F';
	boolean iAmBengali = true; // test

	public AboutMe() { // constructor declared
		System.out.println(" ------------ This is all about Myself -----------");
	}

	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Gender" + myGender + "\nMy Height"
				+ myHeight + "\nI am from Bangladesh: " + iAmBengali);
	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();// constructor initialized
		aboutMe.aboutMe();

	}

}
