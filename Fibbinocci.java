package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(a+" "+b);
		
		for(int i = 0;i<=11;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
		}
	}

}
