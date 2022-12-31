
public class HR {

	public static void main(String[] args) {
		CompanyA A = new CompanyA();
		CompanyB B = new CompanyB();
		MegaCorp M = new MegaCorp(A, B);
		
		M.printEmployees();
	}
}
