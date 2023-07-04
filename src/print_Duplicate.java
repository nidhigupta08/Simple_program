//public class print_Duplicate {
//	
// public static void main(String args[]) {
//
//  String str1 = "going school can teach you more things";
//  
//  //Converts given string into character array 
//  char[] str = str1.toCharArray();
//  
//  System.out.println("Duplicate Characters are:");
//  
//  for (int i = 0; i < str1.length(); i++) // i[0]= s   
//  {
//	  for (int j = i + 1; j < str1.length(); j++)  //j[1]=c <9 j[2]h  o o i s
//	  {
//		  if (str[i] == str[j])   //s==c  s==h   s==o   s==o s==i  s==s
//		  {
//			  System.out.println(str[j]);   //s 
////			  The break statement is used to exit the inner loop as soon as a duplicate character is found. This is done to avoid printing the 
////			  same duplicate character multiple times.
//			 break;  
//		  }
//	  }  
//	  
//  }
// }
//}
import java.util.*;
public class print_Duplicate{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		String newstr="";
	
		Set<Character> print_duplicate =new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char charAtPosition= str.charAt(i);
			
			if(print_duplicate.contains(charAtPosition)) {
				newstr+=charAtPosition;
			}
			else {
				print_duplicate.add(charAtPosition);
			}
		}
		System.out.println(newstr);
	}
}


