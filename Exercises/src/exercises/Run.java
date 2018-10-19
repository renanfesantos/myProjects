package exercises;

import java.util.Scanner;

import exercisesNumbers.ExercisesWithNumbers;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("oi");
		
		ExercisesWithNumbers ewn = new ExercisesWithNumbers();
		int first;
		int second;
		
		Scanner ler = new Scanner(System.in);
		first = ler.nextInt();
		second = ler.nextInt();
		ler.close();
		
		System.out.println("Bigger number between " + first+ " and "+ second+ " is:");
		int resultado = ewn.returnTheBigger(first, second);
		System.out.println(resultado);
		
		System.out.println(" ");
		
		System.out.println(resultado +" in degree is:");


		ewn.decrescente(resultado);
		
		System.out.println(" ");
	
		ewn.changeNumbers(first, second);
		
		ewn.isEqual(first, second);
		
	}

}
