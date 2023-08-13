//Get the number to check for palindrome
//Hold the number in temporary variable
//Reverse the number
//Compare the temporary number with reversed number
//If both numbers are same, print "palindrome number"
//Else print "not palindrome number"

import java.util.Scanner;

public class Palindrome {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	// store the number to originalNum
	int original_num= num;
	int rev = 0;
	while(num!=0) { //num=1234
		
		rev= rev*10 + num%10;  // 0+ 1234%10 = 4   4*10 + 123% 10=> 40+3 =43  430+ 12%10= 432    4320+1=4321
		num/=10;  // 1234/10= 123 (4 eliminate)  123/10= 12   12/10=1   1/10=0
	}
	System.out.println("The reverse number is :" +rev);
	
	if(original_num==rev) {
		System.out.println("The number is palindrome.");
	}
	else {
		System.out.println("THe number is not palindrome.");
	}
	
}
}
