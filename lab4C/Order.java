package lab4C;

import java.time.LocalDate;

public class Order {
	protected String orderNo;
	protected LocalDate orderDate;
	protected double orderAmount;
	
	public Order(String orderNo, LocalDate orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	
	
}
