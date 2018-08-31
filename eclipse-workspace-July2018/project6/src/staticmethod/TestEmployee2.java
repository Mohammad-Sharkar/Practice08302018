package staticmethod;

public class TestEmployee2 {

	public static void main(String[] args) {
		Employee tofael = new Employee();
		Employee.empSalary();		
		tofael.empVacationTime();

		//SuperEmployee Lior = new SuperEmployee();		
	    SuperEmployee.empSalary();
	    Employee.empSalary();
	
	}

}
