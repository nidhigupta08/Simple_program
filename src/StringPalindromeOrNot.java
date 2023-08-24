
public class StringPalindromeOrNot {

//	public static void main(String[] args) {
//String original="suman";
//String reverse="";
//
//int stringlength=original.length();
//
//for(int i=stringlength-1;i>=0;i--) {
//	reverse+=original.charAt(i);
//}
//	if(original.equals(reverse)) {
//		System.out.println("Given number is palindrome");
//	}
//	else {
//		System.out.println("Given number is not palindrome");
//	}
//
//	}
public static void main(String[] args) {
	String str="madam";
	String reverse="";
	int length=str.length();
	for(int i=length-1;i>=0;i--) {
		reverse+= str.charAt(i);
	}
	if(str.equals(reverse)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
	
	
}
