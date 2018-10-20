package studentExercises;

import java.util.Scanner;

public class StudentAvarege {

	private Integer[] grades = new Integer[4];

	public static void main(String[] args) {
		System.out.println("Avarege grade system, please, put the four grades:");

		StudentAvarege sa = new StudentAvarege();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("First");
		sa.getGrades()[0] = ler.nextInt();
		sa.isValidGrade(sa.getGrades()[0]);

		System.out.println("Second");
		sa.getGrades()[1] = ler.nextInt();
		sa.isValidGrade(sa.getGrades()[1]);
		
		System.out.println("Third");
		sa.getGrades()[2] = ler.nextInt();
		sa.isValidGrade(sa.getGrades()[2]);
		
		System.out.println("Fourth");
		sa.getGrades()[3] = ler.nextInt();
		sa.isValidGrade(sa.getGrades()[3]);

		sa.addGrades(sa.getGrades());
		System.out.println(sa.returnAvarege());
		
		ler.close();

	}

	public void addGrades(Integer[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (isValidGrade(grades[i])) {
				this.grades[i] = grades[i];
			} else {
				System.out.println("Grade at the " + i + " position is invalid!");
			}
		}
	}

	public boolean isValidGrade(Integer grade) {
		if ((grade.getClass() == Integer.class) && (grade >= 0 || grade <= 100)) {
			return true;
		} else {
			return false;
		}
	}

	public Double returnAvarege() {
		Integer z = 0;
		for (Integer forGrades : this.getGrades()) {
			z = z + forGrades;
		}
		return (double) z/4;
	}

	public Integer[] getGrades() {
		return grades;
	}

	public void setGrades(Integer[] grades) {
		this.grades = grades;
	}

}
