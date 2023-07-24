package week1.day2;
import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
	int[] a = {1,2,3,4,7,6,8}; 
	Arrays.sort(a);
	for(int i =a[0];i<a.length;i++) {
		if(i !=a[i]) {
			System.out.println(a[i]);
			break;
		}
	}
	
	}

}
