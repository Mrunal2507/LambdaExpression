package com.cg.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Threadfun {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        Thread thread = new Thread(() -> {
	            Consumer<Integer> numberConsumer = System.out::println;
	            numbers.forEach(numberConsumer);
	        });
	        
	        thread.start();
	    }

}
