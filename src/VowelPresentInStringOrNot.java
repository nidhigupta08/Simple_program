
public class VowelPresentInStringOrNot {

	public static void main(String[] args) {
		System.out.println(StringContainsVowel("Nidhi"));
		

// System.out.println(StringContainsVowels("Hello"));	
//System.out.println(StringContainsVowels("Tv"));
//System.out.println(StringContainsVowels("nidhi"));
	}

//	public static  boolean StringContainsVowels(String str) {
//		return str.toLowerCase().matches(".*[aeiou].*");
//		
//	}
	
	public static boolean StringContainsVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
}
