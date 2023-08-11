package week3day2;

import org.checkerframework.checker.units.qual.Length;

public class Palindrome {

	public static void main(String[] args) {
		String test = "madam";
		String rev= "";
		int length = test.length();
		for(int i = length-1;i>=0;--i) {
			rev=rev+test.charAt(i);
			if(test.equals(rev)) {
				System.out.println(test +" is Palindrome");
			}else {
				System.out.println(test +" is not a Palindrome");
			}
			
		}
	}

}
