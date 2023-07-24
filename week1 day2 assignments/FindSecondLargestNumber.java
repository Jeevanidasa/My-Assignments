package week1.day2;
import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] b = {3,2,11,4,6,7};
		int length = b.length;
		Arrays.sort(b);
		System.out.println("Sorted Array : "+Arrays.toString(b));
		System.out.println("Last Second largest number from sorted Array : "+b[length-2]);


	}

}
