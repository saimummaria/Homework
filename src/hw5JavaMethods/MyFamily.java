package hw5JavaMethods;

public class MyFamily {
	public int child1Age=25;
	public int child2Age=21;
	public int child3Age=18;
	public int child4Age=14;
	
	public int myFamily(){
		int sum=child1Age+child2Age+child3Age+child4Age;
		System.out.println("The sum of my childrens age is:" +sum);
		return sum;
		
}
	
public static void main(String[] args) {
	MyFamily family=new MyFamily();
	family.myFamily();
	
}	

}
