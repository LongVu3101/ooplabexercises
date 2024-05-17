package lab01;

import java.util.*;

public class DaysInMonth {
	
	//function to check if a string is an integer
	static boolean isInt(String s) {
	    try {
	        int i = Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException er) {
	        return false;
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//to input from keyboard

		List<String> monthList = List.of("January", "February", "March", 
				"April", "May", "June", "July", "August", "September", 
				"October", "November", "December");
		boolean is_Valid = false;
		int month = 0;
		String string_Month = "";
		
		while (!is_Valid) {
			System.out.println("Enter month: ");
			string_Month = sc.nextLine();
			if (string_Month.equals("Jun.")||string_Month.equals("May.")
					||string_Month.equals("Jul.")) {
				is_Valid = false;
			}else {
				for (String elem:monthList) {
					if (string_Month.equals(elem)||string_Month.equals(elem.substring(0, 3))
							||string_Month.equals(elem.substring(0, 3)+".")) {
						month = monthList.indexOf(elem)+1;
						is_Valid = true;
					}
					else if (isInt(string_Month)) {
						month = Integer.parseInt(string_Month);
						is_Valid = true;
					}
				}	
		}
		}
		int year = 0;
		boolean is_Leap = true;
		is_Valid = false;
		while (!is_Valid) {
			System.out.println("Enter year: ");
			year = sc.nextInt();
			if (year < 0) {
				is_Valid = false;
			}else {
				is_Valid = true;
					}
				}	
		
		if (year % 4 != 0) {
			is_Leap = false;
		}else if (year%100!=0) {
			is_Leap = true;
		}else if (year%400!=0) {
			is_Leap = false;
		}
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:{
			System.out.println(31);
			break;
		}
		case 4:case 6:case 9:case 11:{
			System.out.println(30);
			break;
		}
		case 2:{
			if (!is_Leap) {
			System.out.println(28);
			} else {
			System.out.println(29);
			}
			break;
		}
		}
		
}
}