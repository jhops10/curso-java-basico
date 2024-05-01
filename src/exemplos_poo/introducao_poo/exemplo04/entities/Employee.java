package exemplos_poo.introducao_poo.exemplo04.entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		grossSalary =  (grossSalary * percentage / 100) + grossSalary;
		return grossSalary - tax;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
}
