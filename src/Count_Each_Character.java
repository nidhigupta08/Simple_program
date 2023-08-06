import java.util.HashMap;

public class Count_Each_Character{
	
    public static void main(String[] args) {
    	
        String str = "google";
        
        // HashMap char as a key and occurrence as a value
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) 
        {
        	char charAtPosition= str.charAt(i);
        	
//        	This line checks if the character charAtPosition is already present in the charCount HashMap.
        	if (charCount.containsKey(charAtPosition))
        	{
 //If the character is already present in the HashMap, this line retrieves its current count (value) and assigns it to the variable count.
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
















