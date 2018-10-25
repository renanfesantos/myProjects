package onlineExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		float salario = Float.parseFloat(read.nextLine());
		read.close();
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		float z;
		if (salario < 2000) {
			System.out.println("Isento");
		} else if ((salario < 3000.01) && (salario > 2000)) {
			z = salario - 2000;
			z = (float) (z * 0.08);
			System.out.println("R$ " + df.format(z));
		} else if (salario >= 3000.01 && salario <= 4500) {
			z = salario - 3000;
			z = (float) (z * 0.18);
			z = (float) (z + (1000 * 0.08));
			System.out.println("R$ " + df.format(z));
		} else if (salario > 4500) {
			z = salario - 4500;
			z = (float) (z * 0.28);
			z = (float) (z + (1500 * 0.18));
			z = (float) (z + (1000 * 0.08));

			System.out.println("R$ " + df.format(z));
		}
	}

}
