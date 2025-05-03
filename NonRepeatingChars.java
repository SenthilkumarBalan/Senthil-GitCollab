package org.example.DataStructures;
import java.util.*;

public class NonRepeatingChars {
	
	public static char nonRepeating(String s) {
		Map<Character, Integer> output = new HashMap<>();
		for(char c : s.toCharArray()) {
			output.put(c, output.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry: output.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return '_';
	}
	
	public static void main(String[] args) {
		String s ="senthilkumar";
		char nonRepeating = nonRepeating(s);
		System.out.println(nonRepeating);
	}

}
