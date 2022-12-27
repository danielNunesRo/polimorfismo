package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list= new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			System.out.println("Employee #" + i +" data: ");
			System.out.println("Outsourced: (y/n) ?");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHours = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(emp);
				
			}
			
			else {
				Employee emp = new Employee(name, hours, valuePerHours);
				list.add(emp);
			}
			
			
			
			
			i++;
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		
		sc.close();

	}

}
