package lab4C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// get sum of amount for orders that are within the last month
		LocalDate previousMonth = LocalDate.of(year, month, 1).minusMonths(1);
		double sumOfOrders = 0;
		for (Order order : orders) {
			if (order.orderDate.getMonthValue() == previousMonth.getMonthValue()) 
				sumOfOrders +=  order.getOrderAmount();			
		}

		return baseSalary + (commission * sumOfOrders);
	}

}
