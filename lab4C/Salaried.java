package lab4C;

public class Salaried extends Employee {
	private double salary;
	
	
	public Salaried(String empId, double salary) {
		super(empId);
		this.salary = salary;
	}
	

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public double calcGrossPay(int month, int year) {
		//always the same every month

		return salary;
	}

}
