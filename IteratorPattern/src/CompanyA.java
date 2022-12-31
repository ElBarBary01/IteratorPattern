import java.util.Iterator;
import java.util.LinkedList;

public class CompanyA implements EmployeeIterator{
	
LinkedList<EmployeeInfo> Employee = new LinkedList<EmployeeInfo>();

public CompanyA() {
	EmployeeInfo a = new EmployeeInfo("omar", "CEO", 1000000);
	EmployeeInfo b = new EmployeeInfo("Bassem", "CFO", 1000000);
	Employee.add(a);
	Employee.add(b);
}
public void addEmployee(EmployeeInfo E) {
	Employee.add(E);
}

@Override
public Iterator createEmployeeIterator() {
	return Employee.iterator();
}

}
