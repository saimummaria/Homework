package hw08Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee jenifer =new Employee();
		jenifer.setEmplName("Jenifer Winget");
		jenifer.setEmplAge(30);
		jenifer.setEmplsex('F');
		jenifer.setEmplcitizen( true);
		
		System.out.println("Employee Name:"+ jenifer.getEmplName()+"\nEmployee Age:"+jenifer.getEmplAge()+
				"\nEmployee Gender:"+jenifer.getEmplsex()+"\nEmployee is a us Citizen:"+ jenifer.isEmplcitizen());
	}

}
