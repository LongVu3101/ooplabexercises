package lab01;

import java.util.*;

public class AddTwoMatrices {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int rows = sc.nextInt();
	System.out.println("Enter number of columns: ");
	int columns = sc.nextInt();
	
	System.out.println("Enter elements of the first array: ");
	double[][] firstArray = new double[rows][columns];
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < columns; j++) {
	        firstArray[i][j] = sc.nextDouble();
	    }
	}

	System.out.println("Enter elements of the second array: ");
	double[][] secondArray = new double[rows][columns];
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < columns; j++) {
	        secondArray[i][j] = sc.nextDouble();
	    }
	}
	
	double[][] sumArray = new double[rows][columns];
	for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
        }
	}
	System.out.println(Arrays.deepToString(sumArray));
}
}