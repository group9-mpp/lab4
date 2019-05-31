package lab4C;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Commissioned commissionedEmployee = new Commissioned("123", 0.8, 500);
		commissionedEmployee.addOrder(new Order("100", LocalDate.of(2018, 1, 1), 200));
		commissionedEmployee.addOrder(new Order("100", LocalDate.of(2018, 1, 10), 100));

		Employee[] employees = { new Salaried("121", 4000), new Hourly("122", 15.67, 20), commissionedEmployee };
		
		for (Employee employee : employees) {
			employee.print(2, 2018);
		}
	}

}
