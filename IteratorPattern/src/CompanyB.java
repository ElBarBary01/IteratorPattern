import java.util.HashMap;
import java.util.Iterator;

public class CompanyB implements EmployeeIterator{
	
HashMap<Integer,EmployeeInfo> Employee = new HashMap<Integer,EmployeeInfo>();
static  int key = 0;

public CompanyB() {
	EmployeeInfo a = new EmployeeInfo("Sbace", "CEO", 1000000);
	EmployeeInfo b = new EmployeeInfo("Momen", "CFO", 1000000);
	Employee.put(key++,a);
	Employee.put(key++,b);
}
public void addEmployee(EmployeeInfo E) {
	Employee.put(key++,E);
}
@Override
public Iterator createEmployeeIterator() {
	return Employee.values().iterator();
}
}
