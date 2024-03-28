package lab01;
import java.util.Scanner;

public class nStarsTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 0; i < n; i++) {
		System.out.println(" ".repeat(n-i-1) + "*".repeat(i*2+1));
	}
}
}