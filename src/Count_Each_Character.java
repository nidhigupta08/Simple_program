//
//	import java.util.Scanner;
//	 
//	public class Count_Each_Character {
//	    public static void main(String args[]) {
//	        String str;
//	        int i, length, counter[] = new int[256];
//	 
//	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("Enter a String");
//	        str = scanner.nextLine();
//	 
//	        length = str.length();
//	 
//	        for (i = 0; i < length; i++) { //nidhi gupta 11  0<11
//	            counter[(int) str.charAt(i)]++;  //n 
//	        }
//	 
//	        for (i = 0; i < 256; i++) {
//	            if (counter[i] != 0) {
//	                System.out.println((char) i + " " + counter[i]);
//	            }
//	        }
//	    }
//	} \

import java.util.HashMap;

public class Count_Each_Character {
	
    public static void main(String args[]) {
    	
        String str = "google";
        
        // HashMap char as a key and occurrence as a value
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) 
        {
        	char charAtPosition= str.charAt(i);
        	
        	if (charCount.containsKey(charAtPosition))
        	{
               //Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key.
        		int count = charCount.get(charAtPosition);
        		
//Associates the specified value with the specified key in this map.If the map previously contained a mapping for the key, the oldvalue is replaced.
                 charCount.put(charAtPosition, ++count);
            } 
        	else 
        	{
                charCount.put(charAtPosition, 1);
            }
        }
        	System.out.println(charCount);
    }
}
















