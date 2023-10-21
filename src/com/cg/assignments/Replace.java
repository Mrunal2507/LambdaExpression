package com.cg.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Replace {

	public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        words.replaceAll(toUpperCase);

        System.out.println(words);
    }
}
