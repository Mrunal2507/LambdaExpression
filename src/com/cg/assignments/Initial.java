package com.cg.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Initial {

	public static void main(String args[]) {
		
	        List<String> words = Arrays.asList("Sakshi", "Mrunal", "Shravani");

	        StringBuilder result = new StringBuilder();

	        Consumer<String> appendFirstLetter = word -> result.append(word.charAt(0));

	        words.forEach(appendFirstLetter);

	        String firstLetters = result.toString();

	        System.out.println(firstLetters);
	}
}
