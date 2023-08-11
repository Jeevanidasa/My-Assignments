package week3day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		test = test.toLowerCase();
	      char[] ch = test.toCharArray();
	      
	      for(int i=0; i<ch.length; i=i+2){
	    	  if(Character.isLowerCase(test.charAt(i))) {
	    		  ch[i] = Character.toUpperCase(ch[i]);  
	    	  }else {
	         ch[i] = Character.toLowerCase(ch[i]);
	      }
	      System.out.println(new String(ch));
	   }

	} 
}



