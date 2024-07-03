package hw08Encapsulation;

public class Employee {

	private String emplName;
	private int emplAge;
	private char emplsex;
	private boolean emplcitizen;
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public int getEmplAge() {
		return emplAge;
	}
	public void setEmplAge(int emplAge) {
		this.emplAge = emplAge;
	}
	public char getEmplsex() {
		return emplsex;
	}
	public void setEmplsex(char emplsex) {
		this.emplsex = emplsex;
	}
	public boolean isEmplcitizen() {
		return emplcitizen;
	}
	public void setEmplcitizen(boolean emplcitizen) {
		this.emplcitizen = emplcitizen;
	}
}
