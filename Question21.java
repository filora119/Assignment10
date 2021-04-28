package Assignment10;

public class Question21 {

	public static void main(String[] args) {

//	Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
//	Assume that the string is not empty and that n is in the range from 1 till str.length().

		String str="abXYabc";   
		int counter=2;               
		
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.substring(i,i+2).equals(i+3)) {
			
			

		}
			System.out.println(true);

	
       
  }
  
		
		
		
		
		
	}

}
