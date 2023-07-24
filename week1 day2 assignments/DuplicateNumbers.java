package week1.day2;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int n[]= {2,5,7,7,5,9,2,3};
		int length=n.length;
		Arrays.sort(n);
		System.out.println("Duplicate numbers");
		for (int i=0;i<=length-1;i++) {
			for(int j=i+1;j<=length-1;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i] + "");
				}
			}
		}
	}
}



