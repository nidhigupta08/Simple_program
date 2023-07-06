import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		String original_str= str;
		
		String	reverse=" ";
		
		int len= str.length();  // length = 4 
		
		for(int i= len-1; i>=0;i--) {   //  4-1= 3   3>=0
			reverse= reverse + str.charAt(i); // 0+ 
		}
		System.out.println("The reverse of given string is : " +reverse);
	}
}
