//Print the position of vowels in a given word
import java.util.Scanner;

public class Find_Vowel {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a word");
	   String str = sc.next();
//      String str = new String("Hi Welcome to Tutorialspoint");
	   
      for(int i=0; i<str.length(); i++) { // nidhi = 5 letters   
         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
         { 
            System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
         }
      }
   }
}