package collectionsprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String arr = "We learn java basics as part of java sessions in java week1";
		
		String[] whitespaces = arr.split(" ");
		Set<String> whiteset = new LinkedHashSet<String>();
		for(String words: whitespaces) {
			whiteset.add(words);
			
		}
		System.out.println(whiteset);
		String deli = " ";
		String diff = String.join(deli, whiteset);
		System.out.println(diff);
	}

}
