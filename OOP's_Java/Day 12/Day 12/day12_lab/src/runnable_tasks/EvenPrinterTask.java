package runnable_tasks;

import java.util.stream.IntStream;

public class EvenPrinterTask implements Runnable {
	// state
	private int start;
	private int end;

	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		try {
//IntStream --range --filter--forEach
			IntStream.range(start, end) //IntStream : ints start --end-1
			.filter(i -> i % 2 ==0) //IntStream : ints --even ints in the range
			.forEach(i -> 
			System.out.println(Thread.currentThread().getName()+" printed even no "+i));//name of thrd printed even no : i
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
