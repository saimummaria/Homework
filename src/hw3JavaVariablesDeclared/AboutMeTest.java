package hw3JavaVariablesDeclared;

public class AboutMeTest {  
 public static void main(String[] args) {
	 AboutMe maria=new AboutMe();//constructor initialized.
	 maria.myHobby="crafting";
		maria.myAge=21;
		maria.myHeight=5.01f;
		maria.myGender='F';
		maria.iAmBengali=true;
		maria.rollNumber=02;
		maria.mobilePrice=5000;
		maria.birthYear=2002;
		maria.mykidneyPrice=20000;
		maria.aboutMe();
		
		System.out.println("....This is all about Alex.... ");
		AboutMe alex=new AboutMe();
		 alex.myHobby="Traveling";
		alex.myAge=24;
			alex.myHeight=5.06f;
			alex.myGender='M';
			alex.iAmBengali=false;
			alex.rollNumber=01;
			alex.mobilePrice=6000;
			alex.birthYear=1999;
		alex.mykidneyPrice=20030;
		alex.aboutMe();
}
}
