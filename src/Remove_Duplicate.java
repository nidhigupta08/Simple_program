 import java.util.*;   

public class Remove_Duplicate {   
      
 public static void removeDuplicates(String str)   
 {   
     //Create an empty string   and to store the result after removing duplicates.
     String newstr = new String();   
       
    
         
     // Traverse the string and check for the repeated characters   
     for (int i = 0; i <str.length(); i++)    
     {   
         // store the character available at i th index in the string  
         char charAtPosition = str.charAt(i);   //i[0]=n  i[1]=i i[2]=d i[3]= h i[4]=i  
             
         //This line checks if the character charAtPosition exist  or not in the newstr string.if the charatposition is available in the newstr
         //then it (indexOf method) returns the index of the first occurrence of the character in the string, or -1 if it doesn't exist. 
       
         if (newstr.indexOf(charAtPosition)==-1)  
         {   
             newstr += charAtPosition;   //newstr= n + i + d + h ( indexof(i) return index of 1st occurence  jo ki  i[1] ==-1)
         }   
     }   
     //Print string after removing duplicate characters   
     System.out.println(newstr);  
 }   
 
 // main() method start  
 public static void main(String[] args)   
 {   
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a string: ");
   String str= sc.nextLine(); 
     //call removeDuplicates() method for removing duplicate characters    
     removeDuplicates(str);   
 }   
}