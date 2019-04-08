package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		for (int i = 0; i < 3; i++) {
			double grades = sc.nextDouble();
			aluno.TotalGrades(grades);
		}
		System.out.println(aluno);
		aluno.AvarageGrades();

		sc.close();

	}

}
