package onlineExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TDARacional {
	String[] entradas;

	public static void main(String[] args) {
		TDARacional tr = new TDARacional();
		try {
			tr.leitura();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void leituraExpressao(ArrayList<Scanner> arrayScanner) {
		for (int i = 0; i < arrayScanner.size(); i++) {
			entradas[i] = arrayScanner.get(i).nextLine();
		}
	}

	public void leitura() throws IOException {
		ArrayList<Scanner> arrayScanner = new ArrayList<Scanner>();
		Scanner sc = new Scanner(System.in);
		int numeroVezes = Integer.parseInt(sc.nextLine());
		entradas = new String[numeroVezes];
		for (int i = 0; i < numeroVezes; i++) {
			Scanner scx = new Scanner(System.in);
			arrayScanner.add(scx);
		}
		leituraExpressao(arrayScanner);

		for (int index = 0; index < numeroVezes; index++) {
			for (int i = 0; i < entradas[index].length(); i++) {
				if (entradas[index].charAt(i) == '+') {
					soma(entradas[index]);
				} else if (entradas[index].charAt(i) == '-') {
					subtracao(entradas[index]);
				} else if (entradas[index].charAt(i) == '*') {
					multiplicacao(entradas[index]);
				} else {
					divisao(entradas[index]);
				}

			}
		}
		for (Scanner scan : arrayScanner) {
			scan.close();
		}
		sc.close();
	}

	public void soma(String soma) {
		// (N1*D2 + N2*D1) / (D1*D2)
		// (1 / 2 + 3 / 4)
		soma = soma.replaceAll(" ", "");
		String[] numeros = new String[2];
		numeros = soma.split("\\+");
		String[] numero1 = numeros[0].split("/");
		String[] numero2 = numeros[1].split("/");

		int n1 = Integer.parseInt(numero1[0]);
		int d1 = Integer.parseInt(numero1[1]);
		int n2 = Integer.parseInt(numero2[0]);
		int d2 = Integer.parseInt(numero2[1]);

		int parte1 = ((n1 * d2) + (n2 * d1));
		int parte2 = (d1 * d2);

		if ((parte1 % 2 == 0) && (parte2 % 2 == 0)) {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 / 2 + "/" + parte2 / 2);
		} else {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 + "/" + parte2);
		}

	}

	public void subtracao(String subtracao) {
		// (N1*D2 + N2*D1) / (D1*D2)
		// (1 / 2 + 3 / 4)
		subtracao = subtracao.replaceAll(" ", "");
		String[] numeros = new String[2];
		numeros = subtracao.split("\\+");
		String[] numero1 = numeros[0].split("/");
		String[] numero2 = numeros[1].split("/");

		int n1 = Integer.parseInt(numero1[0]);
		int d1 = Integer.parseInt(numero1[1]);
		int n2 = Integer.parseInt(numero2[0]);
		int d2 = Integer.parseInt(numero2[1]);

		int parte1 = ((n1 * d2) + (n2 * d1));
		int parte2 = (d1 * d2);

		if ((parte1 % 2 == 0) && (parte2 % 2 == 0)) {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 / 2 + "/" + parte2 / 2);
		} else {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 + "/" + parte2);
		}

	}

	public void multiplicacao(String multiplicacao) {

		// (N1*D2 + N2*D1) / (D1*D2)
		// (1 / 2 + 3 / 4)
		multiplicacao = multiplicacao.replaceAll(" ", "");
		String[] numeros = new String[2];
		numeros = multiplicacao.split("\\+");
		String[] numero1 = numeros[0].split("/");
		String[] numero2 = numeros[1].split("/");

		int n1 = Integer.parseInt(numero1[0]);
		int d1 = Integer.parseInt(numero1[1]);
		int n2 = Integer.parseInt(numero2[0]);
		int d2 = Integer.parseInt(numero2[1]);

		int parte1 = ((n1 * d2) + (n2 * d1));
		int parte2 = (d1 * d2);

		if ((parte1 % 2 == 0) && (parte2 % 2 == 0)) {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 / 2 + "/" + parte2 / 2);
		} else {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 + "/" + parte2);
		}
	}

	public void divisao(String divisao) {
		// (N1*D2 + N2*D1) / (D1*D2)
		// (1 / 2 + 3 / 4)
		divisao = divisao.replaceAll(" ", "");
		String[] numeros = new String[2];
		numeros = divisao.split("\\+");
		String[] numero1 = numeros[0].split("/");
		String[] numero2 = numeros[1].split("/");

		int n1 = Integer.parseInt(numero1[0]);
		int d1 = Integer.parseInt(numero1[1]);
		int n2 = Integer.parseInt(numero2[0]);
		int d2 = Integer.parseInt(numero2[1]);

		int parte1 = ((n1 * d2) + (n2 * d1));
		int parte2 = (d1 * d2);

		if ((parte1 % 2 == 0) && (parte2 % 2 == 0)) {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 / 2 + "/" + parte2 / 2);
		} else {
			System.out.println(parte1 + "/" + parte2 + " = " + parte1 + "/" + parte2);
		}

	}
}
