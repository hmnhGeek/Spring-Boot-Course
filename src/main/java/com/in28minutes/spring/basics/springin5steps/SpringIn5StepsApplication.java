package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		// injecting the binary search class here...
		
		// instead of the algorithm being hardcoded in the binary search
		// we've made it loosely coupled by passing the algorithm as an input 
		// to the binary search class.
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 3);
		System.out.println(result);
		
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
