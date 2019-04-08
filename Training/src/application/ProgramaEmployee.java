package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramaEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.println("Gloss salary: ");
		employee.GlossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employee);
		System.out.println("Which percentagem to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		

		sc.close();
	}

}
