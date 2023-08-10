import java.util.*;
public class demo {
public static void main(String args[]) {
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter a string:");
//	String str= sc.nextLine();
String str="nidhi";
	String newstr="";
	Set<Character> Remove_duplicate = new HashSet<>();
	
	for(int i=0;i<str.length();i++) {
		char charAtPosition= str.charAt(i);
		if(Remove_duplicate.contains(charAtPosition)) {
			newstr+=charAtPosition;
		}
		else 
		{
			Remove_duplicate.add(charAtPosition);
		}
	}
	System.out.println(newstr);
}
}
