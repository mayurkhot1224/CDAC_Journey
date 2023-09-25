package tester;

import java.util.Scanner;

import runnable_tasks.AveragerTask;
import runnable_tasks.EvenPrinterTask;
import runnable_tasks.OddPrinterTask;

public class TestConcurrency {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter range : begin n end");
			int start = sc.nextInt();
			int end = sc.nextInt();
			// create tasks , attach a thrd to the task , start the thrd
			// imple Runnable : Thread (Runnable task,String nm)
			Thread t1 = new Thread(new EvenPrinterTask(start, end), "even");// t1 : NEW
			Thread t2 = new Thread(new OddPrinterTask(start, end), "odd");// t2 : NEW
			Thread t3 = new Thread(new AveragerTask(start, end), "avg");// t3 : NEW
			// start the thrds
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			t3.join();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main over.....");

	}

}
