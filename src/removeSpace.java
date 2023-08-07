public class  removeSpace{  
	
    public static void main(String[] args) {  
//        String str = "India     Is My    Country";  
//        String str1="Nidhi   Gupta      is      recently    passed out student.";
//        // is used to match a single whitespace character
//        String replaceString = str.replaceAll("\\s", "?"); // using built in method  
//        
//     //helps us to match the sequence of more than one whitespace character  
//        //+ sign in the regex pattern is also knwn as greedy quantifier. count multiple occurrence as a single.
//        String replaceStr= str1.replaceAll("\\s+", "?"); 
//        
//        System.out.println(replaceString);  // India?????Is?My????Country
//        	
//        System.out.println(replaceStr);  //	Nidhi?Gupta?is?recently?passed?out?student.    	
  System.out.println(removeWhiteSpaces("nidhi gupta is a girl "));    
    }  
  public static  String removeWhiteSpaces(String input) {
    	StringBuilder output = new StringBuilder();
    	
    	char[] charArray = input.toCharArray();
    	
    	for (char c : charArray) {
    		if (!Character.isWhitespace(c))
    			
    			output.append(c);
    	}
    	
    	return output.toString();
    }
}  