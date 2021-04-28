package Assignment10;

public class Question24 {

	public static void main(String[] args) {

		//Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

		System.out.println(appearances("We study java not python"));

    }
    
    public static boolean appearances(String str) {
     
      int java = 0;
      int python = 0;
      for (int i = 0; i < str.length(); i++) { 
          
        if (i <str.length()-3) {  
            
          String word = str.substring(i,i+4);
          if (word.equals("java"))
            java++;
        }
        if (i < str.length()-5) {
            
          String word2 = str.substring(i,i+6);
          if (word2.equals("python"))
            python++;
        }
      }
      if (java == python)
        return true;
      else
        return false;
		
		
		
		
	}

}
