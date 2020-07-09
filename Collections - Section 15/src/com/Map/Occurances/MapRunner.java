package com.Map.Occurances;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		characterOccurances();
		stringOccurances();
	}
	
	private static void characterOccurances() {
		String str = "This is awesome. We love it.";
		Map<Character, Integer> charOccurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		for(char character:characters) {
			//Get the Character
			Integer integer = charOccurances.get(character);
			if (integer == null) {
				charOccurances.put(character, 1);
				System.out.println(charOccurances);
			}else {
				charOccurances.put(character, integer + 1);
				System.out.println(charOccurances);
			}
		}
		System.out.println(charOccurances);
	}
	
	private static void stringOccurances() {
		String str = "This is awesome. We love it.";
		Map<String, Integer> strOccurances = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word:words) {
			Integer integer = strOccurances.get(word);
			if(integer == null) {
				strOccurances.put(word, 1);
				System.out.println(strOccurances);
			}else {
				strOccurances.put(word, integer + 1);
				System.out.println(strOccurances);
			}
		}
		System.out.println(strOccurances);
	}
}
