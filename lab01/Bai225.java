package lab01;
import java.util.Scanner;

public class Bai225 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String strNum1 = sc.next();
	String strNum2 = sc.next();
	
	double num1 = Double.parseDouble(strNum1);
	double num2 = Double.parseDouble(strNum2);
	
	double sum = num1+num2;
	double difference = num1-num2;
	double product = num1*num2;
	double quotient = num1/num2;
	System.out.println(sum);
	System.out.println(difference);
	System.out.println(product);
	System.out.println(quotient);
	
	if (num1 % num2 == 0) {
		System.out.println(strNum2	+" is the divisor");
	}
}
}