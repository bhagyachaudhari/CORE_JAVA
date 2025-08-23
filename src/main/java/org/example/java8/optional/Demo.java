package org.example.java8.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Demo {

	public static void main(String args[]) throws Exception {
		
		//Optional.of()
		Optional<String> str = Optional.of("Java");
		System.out.println(str);
		
		//get()
		System.out.println(str.get());
		
		//isPresent()
		Optional<String> strNull = Optional.of("Python");
		System.out.println(strNull.isPresent());
		
		//ifPresent()
		strNull.ifPresent((v)->{
			System.out.println(v.toUpperCase());
		});
		
		strNull.ifPresent(new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				System.out.println(arg0);
			}
		});
		
		//ofNullable()
		String[] s = new String[] {"A", "B", null};
		Optional<String> value = Optional.ofNullable(s[2]);
		
		//orElse()
		System.out.println(value.orElse("test"));
		
		//empty()
		System.out.println(Optional.empty().orElse("test"));
		
		//orElseGet()
		String nullValue = null;
		String name = Optional.ofNullable(nullValue).orElseGet(()->"test1");
		System.out.println(name);
		
		//orElseThrow()
		String name1 = Optional.ofNullable(nullValue).orElseThrow(Exception::new);
		System.out.println(name1);
		
		
	}
}
