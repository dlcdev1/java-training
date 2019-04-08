package entities;

public class Employee {

	public String Name;
	public double GlossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GlossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GlossSalary += GlossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return Name + 
				" , $ " +
				String.format("%.2f", NetSalary());
	}

}
