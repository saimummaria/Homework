package hw4Constructor;

public class Student {

	String studentName;// variable declared
	int studentID;
	char Gender;
	boolean SheIsaStudent;
	float studentgrade;

	public Student() {// Constructor Declared //Default Constructor
		System.out.println("This is all about Student");

	}

	public Student(String studentName, int studentID, char gender, boolean sheIsaStudent, float studentgrade) {
		this.studentName = studentName;
		this.studentID = studentID;
		Gender = gender;
		SheIsaStudent = sheIsaStudent;
		this.studentgrade = studentgrade;
		System.out.println("Student name:" + studentName + ",Student Id:" + studentID + ";Student Grade:" + studentgrade
				+ ";Student Gender:" + gender + ",She is a it student:" + sheIsaStudent);
	}

}
