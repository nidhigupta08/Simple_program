//Reverse a sentence without changing the position of vowel
//import java.util.Scanner;
//
//public class reverse_without_vowel {
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a sentence: ");
//		
//		String str= sc.nextLine();
//		String original_str= str;
//		 String rev= "";
//		 
//		int  len =str.length();
//		
//		for(int i=len-1; i>=0; i-- ) {
//			
//			rev= rev + str.charAt(i);
//			
//			System.out.println("Reverse of given sentence are:" +rev);
//			
//			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i) =='u'){
//				
//				
//			}
//		}
//		
//	}
//}

import java.util.Scanner;

public class  reverse_without_vowel{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = scanner.nextLine();

    String reversedSentence = "";
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < sentence.length(); i++) {
      char c = sentence.charAt(i);
      if (vowels.indexOf(c) >= 0) {
        reversedSentence += c;
      } else {
        reversedSentence += (char)(c ^ 32);
      }
    }

    System.out.println("The reversed sentence with vowels in their original order is: " + reversedSentence);
  }
}