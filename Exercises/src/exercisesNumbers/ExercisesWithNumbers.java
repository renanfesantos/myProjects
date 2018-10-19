package exercisesNumbers;

public class ExercisesWithNumbers {

	public int returnTheBigger(int first, int second) {
		if (first >= second)
			return first;

		return second;
	}

	public void decrescente(int numero) {
		while (numero >= 0) {
			System.out.println(numero--);
		}
	}
	
	public void changeNumbers(int first, int second){
		int aux = first;
		first = second;
		second = aux;
		
		System.out.println(" swing numbers, ohhhhh first = " + first +" second = "+second);
	}
	
	public void isEqual(int first, int second){
		if (first > second) {
			System.out.println(" The numer "+ first + " bigger than "+second);
		} else if (first == second) {
			System.out.println("The numbers have the same value.");
		} else {
			System.out.println(" The numer "+ second + " bigger than "+first);
		}
	}
	
}
