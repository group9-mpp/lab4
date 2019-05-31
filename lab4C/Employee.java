package lab4C;

public abstract class Employee {
	private String empId;

	public Employee(String empId) {
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public abstract double calcGrossPay(int month, int year);

	public Paycheck calcCompensation(int month, int year) {
		double grossPay = calcGrossPay(month, year);
		/*
		 * FICA is 23% State tax is 5% Local tax is 1% Medicare is 3% Social Security is
		 * 7.5%
		 */;

		double fica = 0.23 * grossPay;
		double state = 0.05 * grossPay;
		double local = 0.01 * grossPay;
		double medicare = 0.03 * grossPay;
		double socialSecurity = 0.075 * grossPay;

		return new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
	}

	public void print(int month, int year) {
		System.out.println("Employee ID: " + empId +", Type: "+ getClass().getSimpleName());

		Paycheck compensation = calcCompensation(month, year);
		compensation.print();
	}
}
