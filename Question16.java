package Assignment10;

public class Question16 {

	public static void main(String[] args) {
		//Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
		//The string should be 4 and more characters.
		
String str = "xjavap"; //0 and 1
		
		//String str = "xbadxx";
		
		//String str = "xxbadxx";
		
		boolean flag = true;
				
				
				
		for(int i=0;i<2;i++) {
			
			if(str.substring(i, i+4).equals("java")) {
				
				flag = true;
				break;
				
			}else {
				
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
	}

}
