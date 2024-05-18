package lab01;

import java.util.*;

public class SolveSecondDegreeEquation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a, b, c, delta, x1,x2;
	
	System.out.println("Enter a: ");
	a = sc.nextDouble();
	System.out.println("Enter b: ");
	b = sc.nextDouble();
	System.out.println("Enter c: ");
	c = sc.nextDouble();
	
	delta = Math.pow(b, 2) - 4*a*c;
	
	if (a!=0) {
		if (delta < 0) {
			System.out.println("No solution");
		}
		else if (delta == 0) {
			x1 = (-b)/(2*a);
			System.out.println("x1 = x2 = " + x1);
		}
		else {
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}
	else {
		if (b!=0) {
			System.out.println(-c/b);
		}
		else if (b==0&&c==0){
			System.out.println("Infinite solution");
		}
		else {
			System.out.println("No solution");
		}
	}
}
}