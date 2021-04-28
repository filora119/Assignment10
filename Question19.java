package Assignment10;

public class Question19 {

	public static void main(String[] args) {
//Return the number of times that the string 
		//"java" appears anywhere in the given string word.
		
		
		String str="javaxjava";   
		int counter=0;               
		
		for(int i=0;i<str.length()-3;i++) {
			
			if(str.substring(i,i+4).equals("java")) {
			
				counter++;
			
		}
		
	}
	System.out.println(counter);
       
		
		
		
		
	}

}
