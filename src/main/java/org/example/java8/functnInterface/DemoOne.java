package org.example.java8.functnInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOne {

	public static void main(String[] args) {
		
		//Pre-defined functional interfaces..

		//Runnable
		System.out.println("***** Runnable *****");
		Runnable r = ()->{
			System.out.println("Runnable executed...");
		};
		r.run();
		
		//Comparable
		System.out.println("***** Comparable *****");
		List<Integer> list = Arrays.asList(4,3,2,6,1,5);
		list.sort((s1, s2)->s1.compareTo(s2));
		System.out.println(list);
		list.sort(Collections.reverseOrder());
		System.out.println(list);
		
		//functional interfaces introduced in Java 8..
		
		//Consumer
		System.out.println("***** Consumer *****");
		Consumer<Integer> c1 = (value)->System.out.println(value);
		c1.accept(3);
		
		//Predicate
		System.out.println("***** Predicate *****");
		Predicate<String> p = (value)->value != null;
		System.out.println(p.test(null));
		
		//Function
		System.out.println("***** Function *****");
		Function<String, Integer> function = s->s.length();
		System.out.println(function.apply("Bhagyashri"));
		
		//Supplier
		System.out.println("***** Supplier *****");
		Supplier<String> otps = ()->{
			String otp = "";
			for(int i=0; i<4; i++) {
				otp = otp + (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		
		//BiPredicate
		System.out.println("***** BiPredicate *****");
		BiPredicate<Integer, Integer> testEven = (a, b)->((a+b)%2) == 0;
		System.out.println(testEven.test(2, 4));
		
		//BiFunction
		System.out.println("***** BiFunction *****");
		BiFunction<Integer, Integer, Integer> sum = (a, b)->{
			return a+b;
		};
		System.out.println(sum.apply(2, 4));
		
		//BiConsumer
		System.out.println("***** BiConsumer *****");
		BiConsumer<String, String> str = (a, b)->System.out.println(a+" - "+b);
		str.accept("Hello", "World");
	
	}
}
