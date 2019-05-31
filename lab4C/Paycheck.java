package lab4C;

public final class Paycheck {
	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}

	
	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
	public void print() {
		System.out.println("Paystub:");
		System.out.println(" Gross Pay: " + grossPay);
		System.out.println(" Fica:  0.23");
		System.out.println(" State: 0.05");
		System.out.println(" Local: 0.01");
		System.out.println(" Medicare: 0.03");
		System.out.println(" Social Security: 0.075");
		System.out.println(" *************************************");
		System.out.println(" NET PAY: " + getNetPay());
		System.out.println("_________________________________________\n");
	}
	
}
