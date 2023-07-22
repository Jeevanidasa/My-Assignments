package week1.day1;

//public class IsPrime {
//
//	public static void main(String[] args) {
//		int n=15;
//		
//				for(int i=2;i<n/2;i++){
//					 if(i%2==0) 
//					 {
//						 System.out.println(n+  " number is Prime");
//					 }
//					 else 
//					 {
//						 System.out.println(n+  " number is not Prime");
//					 }
//				}
//		}
//}



public class IsPrime {
    public static void main(String[] args) {
        int number= 5;
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}