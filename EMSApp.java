package Test;

import java.sql.SQLException;
import java.util.Scanner;

import Entities.Employee;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;

public class EMSApp {
	
	private static EmployeeService   employeeService  =  new EmployeeServiceImpl();

	public static void main(String[] args) {
		
		Employee emp = new Employee(2, "Mohit", "Malhotra", "Male");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the id ");
		int id = sc.nextInt();
		
		System.out.println("enter the firstName ");
		String firtsName = sc.next();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(id);
		emp1.setFirstName(firtsName);
		
		
		try {
			employeeService.save(emp1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
