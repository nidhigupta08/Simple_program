import java.util.*;
public class PrintDuplicate {

	public static void main(String[] args) {

		String str="google";
		String newStr="";
		
		Set<Character> printDuplicate=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			char charAtPosition= str.charAt(i);
			if(printDuplicate.contains(charAtPosition)) {
				newStr+=charAtPosition;
			}
			else {
				printDuplicate.add(charAtPosition);
			}
		}
		System.out.println(newStr);
	}

}
