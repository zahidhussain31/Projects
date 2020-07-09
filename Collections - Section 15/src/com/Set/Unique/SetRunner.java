package com.Set.Unique;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		ArrayList<Character> chara = new ArrayList<>();
		chara.add('A');
		chara.add('Z');
		chara.add('A');
		chara.add('B');
		chara.add('Z');
		chara.add('F');
		
		System.out.println(chara);
		
		Set<Character> TreeSet = new TreeSet<>(chara);
		System.out.println(TreeSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(chara);
		System.out.println(linkedHashSet);
		
		Set<Character> hashSet = new HashSet<>(chara);
		System.out.println(hashSet);
	}

}
