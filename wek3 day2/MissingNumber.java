package collectionsprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
int [] missing = {1,2,3,4,5,6,7,9,10};
Set<Integer> missingno = new LinkedHashSet<Integer>();
for(int i=0;i<missing.length;i++) {
	missingno.add(missing[i]);
}
System.out.println("converted to set and removed duplicate:" +missingno);
Integer[] unique = missingno.toArray(new Integer[missingno.size()]);
for(int i=0;i<unique.length;i++) {
	if(unique[i]!=i+1) {
		System.out.println("The missing number is " +i);
		}
	i++;
}
	}

}
