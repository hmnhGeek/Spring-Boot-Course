package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	// What are the beans? -- using @Component
	// What are the dependencies of these beans? -- using @Autowired
	// Where to search for these beans? -- no need, Spring already takes care of this,
	//                                     and searches it in all directories where this 
	//                                     main method is defined.

	public static void main(String[] args) {
		// injecting the binary search class here...
		
		// instead of manually doing dependency injection, we will now
		// use Inversion of Control to get instances of binary search class.
		
		// store the application context somewhere.
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		// use the application context to get the bean.
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 3);
		System.out.println(result);
		
	}

}
