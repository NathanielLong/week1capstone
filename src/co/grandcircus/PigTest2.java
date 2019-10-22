package co.grandcircus;

public class PigTest2 {
	
	public static void main(String[] args) {
		
		System.out.println(pigLatin("Please"));
		
	}

	static boolean isVowel(char c) { 
	    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
	            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
	} 
	  
	static String pigLatin(String s) { 
	  
	    // the index of the first vowel is stored. 
	    int len = s.length(); 
	    int index = -1; 
	    for (int i = 0; i < len; i++) 
	    { 
	        if (isVowel(s.charAt(i))) { 
	        index = i; 
	        break; 
	    } 
	    } 
	  
	    // Pig Latin is possible only if vowels 
	    // is present 
	    if (index == -1) 
	        return "-1"; 
	  
	    // Take all characters after index (including 
	    // index). Append all characters which are before 
	    // index. Finally append "ay" 
	    return s.substring(index) + 
	           s.substring(0, index) + "ay"; 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
