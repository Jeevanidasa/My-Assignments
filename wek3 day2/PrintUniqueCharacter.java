package collectionsprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "NagaSantoshTarun";
		char[] name2 =name.toCharArray();
		Set<Character> duplicatename = new LinkedHashSet<Character>();
		for (Character dup:name2) {
			duplicatename.add(dup);
			
		}
		System.out.println(duplicatename);

	}

}
