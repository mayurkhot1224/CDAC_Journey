package func_strms;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		//  Create stream of ints between 1-100 & display all even elements.
		IntStream.range(1,101) //IntStream : 1--100
		.filter(i -> i % 2==0)//IntStream : even ints
		.forEach(i -> System.out.print(i+" "));

	}

}
