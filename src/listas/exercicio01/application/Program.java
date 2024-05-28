package listas.exercicio01.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import listas.exercicio01.entities.Employee;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i += 1) {
			System.out.println("Emplyoee # " + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
				
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println("=============================");
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println("=============================");
		
		System.out.println("List of employees: ");
		for(Employee employee : employees ) {
			System.out.println(employee.toString());
		}
		
		
		sc.close();

	}

}
