package Assignment10;

public class Question23 {

	public static void main(String[] args) {
		String word = "breadjambread";
		int lastIndexOfFirstBread = word.indexOf("bread") + "bread".length();
		int firstIndexOfSecondBread = word.lastIndexOf("bread");
		
		String wordBetweenFirstAndSecondBread = word.substring(lastIndexOfFirstBread, firstIndexOfSecondBread);
		
		if(wordBetweenFirstAndSecondBread.equals("bread")) {
			System.out.println("nothing!");
			return;
		}
		
		System.out.println(wordBetweenFirstAndSecondBread);
    
		
		System.out.println(word.lastIndexOf("bread"));
		
		
		}
			
		}
		
	
       
		
		
		

		
		
		
	


