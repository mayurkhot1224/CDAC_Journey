package runnable_tasks;

import java.util.stream.IntStream;

public class AveragerTask implements Runnable {
	// state
	private int start;
	private int end;

	public AveragerTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("ctor invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		try {
//IntStream --range --average--orElseThrow
			double avg = IntStream.range(start, end) // IntStream : ints start --end-1
					.average() //special case of reduction : terminal op.
					.orElseThrow();//rets the value or throws NoSuchElementExc
			System.out.println("Average of the range " + avg 
					+ " printed by " + Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");
	}
}
