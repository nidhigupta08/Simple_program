
//write a simple java program to Print unique letters in a given word/sentence.
//import java.util.Scanner;
//
//public class unique_letter{
//	
//	   public static void uniqueCharacters(String str){
//	    	
//		      String newstr = ""; 
//		      int leng=str.length();	
//		      
//		      for (int i = 0; i < leng; i++){ 
//		    	  char charAtPosition =str.charAt(i);
//		    	  
//		            if (newstr.indexOf(charAtPosition) == - 1){ 
//		               newstr += charAtPosition;
//		         }
//		      }
//
//		    System.out.println(newstr + "  ");
//
//		   }
//   public static void main (String[]args){
//	   
//   Scanner sc = new Scanner (System.in); 
//
//     System.out.println("Enter a word: ");
//     
//   String  str = sc.nextLine();
//
//     uniqueCharacters(str); 
//}
//}   

import java.util.*;
public class unique_letter{
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		 String str=sc.nextLine();
		 
		 Set<Character> Unique_letter= new HashSet<>();
		 
		 for(int i=0; i<str.length();i++) {
			 char charAtPosition= str.charAt(i);
			 Unique_letter.add(charAtPosition);
		 }
		 for(Character letter: Unique_letter)
		 {
			 System.out.println(letter);
		 }
		 
	}
}

//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.



















