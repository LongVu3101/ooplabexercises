package lab01;

import java.util.*;

public class SolveLinearSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a11, a12, a21, a22, b1, b2, D, D1, D2;
	double x1, x2;
	
	System.out.println("Enter a11:");
	a11 = sc.nextDouble();
	System.out.println("Enter a12:");
	a12 = sc.nextDouble();
	System.out.println("Enter a21:");
	a21 = sc.nextDouble();
	System.out.println("Enter a22:");
	a22 = sc.nextDouble();
	System.out.println("Enter b1:");
	b1 = sc.nextDouble();
	System.out.println("Enter b2:");
	b2 = sc.nextDouble();
	
	D = a11*a22 - a12*a21;
	D1 = b1*a22 - b2*a12;
	D2 = b2*a11 - b1*a21;
	
	if (D!=0) {
		x1 = D1/D;
		x2 = D2/D;
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
	else {
		if (D1==0&&D2==0) {
			System.out.println("Infinite solution");
		}
		else {
			System.out.println("No solution");
		}
	}
	
	
}
}