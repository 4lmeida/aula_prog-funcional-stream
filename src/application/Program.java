package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 5, 8, 9, 10);
		Stream<Integer> st1 = list.stream();
		System.out.println(st1.toList());
		
		Stream<String> st2 = Stream.of("Maria", "Bob", "Joao");
		System.out.println(st2.toList());
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(st3.limit(10).toList());
		
		Stream<Long> st4 = Stream.iterate(new long[]{0L, 1L}, p ->new long[]{p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(st4.limit(20).toList());
		

	}

}
