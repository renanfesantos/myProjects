package onlineExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoDots {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String xy;
		xy = read.nextLine();
		String[] axy = xy.split(" ");
		Float x1 = Float.parseFloat(axy[0]);
		Float y1 = Float.parseFloat(axy[1]);
		
		xy = read.nextLine();
		read.close();
		axy = xy.split(" ");
		Float x2 = Float.parseFloat(axy[0]);
		Float y2 = Float.parseFloat(axy[1]);
		
		Double distance;
		
		distance = (double) Math.pow((x2 - x1),2);
		distance = distance + (double) Math.pow((y2 - y1),2);
		distance = Math.sqrt(distance);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(4);
		df.setMinimumFractionDigits(4);
		
		System.out.println(df.format(distance));

	}

}
