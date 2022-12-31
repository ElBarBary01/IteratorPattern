import java.util.Iterator;

public class MegaCorp {
	
	CompanyA employeesA;
	CompanyB employeesB;
	
	EmployeeIterator iterA;
	EmployeeIterator iterB;
	
	public MegaCorp(EmployeeIterator iterA,EmployeeIterator iterB) {
		this.iterA = iterA;
		this.iterB = iterB;
	}
	public void showEmployees(Iterator iterator){
		while(iterator.hasNext()){
			EmployeeInfo E = (EmployeeInfo) iterator.next();
			System.out.println("Name: "+E.getName());
			System.out.println("Role: "+ E.getRole());
			System.out.println("Salary: "+ E.getSalary());
		}
		
	}
public void printEmployees(){
	Iterator CompanyA  = iterA.createEmployeeIterator();
	Iterator CompanyB = iterB.createEmployeeIterator();
		System.out.println("Company A");
	    showEmployees(CompanyA);
	    System.out.println("Company B");
		showEmployees(CompanyB);
	}
}
