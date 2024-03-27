package mahiapp;

public class VowCon {    
    public static void main(String[] args) {
    	
        int vowCount = 0, conCount = 0;    
        String str = "Feyd Rautha";   
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') { 
                vowCount++;    
            }   
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {   
                conCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vowCount);    
        System.out.println("Number of consonants: " + conCount);    
    }    
} 
