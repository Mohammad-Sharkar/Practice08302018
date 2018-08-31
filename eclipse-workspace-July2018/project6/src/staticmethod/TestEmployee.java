package staticmethod;

public class TestEmployee {

	public static void main(String[] args) {
		Employee tofael = new Employee();
		Employee.empSalary();		
		tofael.empVacationTime();

		//SuperEmployee Lior = new SuperEmployee();		
	SuperEmployee.empSalary();
	
	}

}
