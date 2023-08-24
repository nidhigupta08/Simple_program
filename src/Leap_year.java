import java.util.Scanner;
public class Leap_year {
	public static void main(String[] args) {
	
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter any  year  to check it is a leap year or not: ");
//		
//		int leap_year= sc.nextInt();
//		
//		if( (leap_year % 4==0) && (leap_year %100!=0) || (leap_year%400 ==0) ) {
//			System.out.println("Given year is a leap year");
//		}
//		else {
//			System.out.println("Given year is not a leap year.");
//		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year to check leap year or not: ");
		int num=sc.nextInt();
		if((num %4==0) && (num % 100!=0) || (num % 400==0)) {
			System.out.println("Given year is a leap year");
		}
		else {
			System.out.println("Given year is not a leap year");
		}
}
}
