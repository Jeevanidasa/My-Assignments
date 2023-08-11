package week3day2;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		 
		        
		        String value="";
		        String test="I am a software tester";
		        String[] t = test.split(" ");
		       
		       // System.out.println (Arrays.toString(t));
		        int arr= t.length;
		        System.out.println (arr);
		        for (int i=0; i<t.length;i++)
		        {
		           if(i%2 != 0) {
		        	   char[] charArray = t[i].toCharArray();
		        	 for (int j = charArray.length-1; j >=0; j--) {
		        		 System.out.print(charArray[j]);
						
					}  
		           }
		            
		           else {
		        	    System.out.print(" ");
		        	    System.out.print(t[i]+" ");
		           }
		            }

		 }
		 

	}

