package entities;

public class Aluno {
	public String Name;
	public double grades;
	public boolean pass;

	public double TotalGrades(double grades) {
		return this.grades += grades;
	}
	
	public void AvarageGrades() {
		if(grades > 60) {
			pass = true;
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + (grades - 60));
		}
		
	}
	
	
	public String toString() {
		return "FINAL GRADE " 
				+ String.format("%.2f ", grades);
	}
	
}