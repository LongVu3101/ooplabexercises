package lab01;
import java.util.*;

public class SolveLinearEquations {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	if (a!=0) {
		System.out.println(-b/a);
	}
	else if (a==0&&b==0){
		System.out.println("Infinite solution");
	}
	else {
		System.out.println("No solution");
	}
}
}