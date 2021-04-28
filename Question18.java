package Assignment10;

public class Question18 {

	public static void main(String[] args) {

		//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
		//		separated by the separator string.	
		
		
		String word="This";
		String sep="And";
		int counter=2;
		
		
String lastWord;
        
        for(int i = 0; i < counter; i++) {
            
            System.out.print(word);
            if(i == counter-1) {
                break;
            }
            for(int j = 0; j < counter; j++) {
                System.out.print(sep);
                break;
		
            }
        }
		
	}

}
