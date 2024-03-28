package lab01;

import java.util.*;

public class SortNumericArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int numElement = sc.nextInt();
		double[] userArray = new double[numElement];
		System.out.println("Enter elements: ");
		for (int i = 0; i < numElement; i++) {
			userArray[i] = sc.nextDouble();
		}
		Arrays.sort(userArray);
		System.out.println(Arrays.toString(userArray));
		
		double sum = 0;
		double average = 0;
		for (double num : userArray) {
			sum += num;
			average = sum / userArray.length;
		}
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
	}
}