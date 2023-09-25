package func_strms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		//are the streams reusable ? NO
		int[] data= {10,23,1,2,45,5,6,-10,8,567,89};
		//sort the data (asc) n display data : in single java stmt (using Functional streams)
		//1. Stream the data from int[] : src
		//2 any intermediate ops ???
		//3 . any terminal op ???
		IntStream intStrm=Arrays.stream(data) //java.util.stream.IntStream : i/f : refer primitive  int data
		.sorted();
		//IntStream : sorted as per Natural ordering --- int strm
		System.out.println("Displaying sorted ints ");
		intStrm.forEach(i -> System.out.print(i+" "));//strm is closed : forEach : terminal op
//		System.out.println("Displaying sorted ints again : ");
//		intStrm.forEach(i -> System.out.print(i+" "));//run time err : java.lang.IllegalStateException : strm is alrdy closed!!!!
	}

}



