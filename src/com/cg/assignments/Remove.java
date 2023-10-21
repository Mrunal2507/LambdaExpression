package com.cg.assignments;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("car");
        words.add("dog");
        words.add("elephant");

        words.removeIf(word -> word.length() % 2 != 0);

        System.out.println(words);
    }
}
