package com.prowings.multithreading;

public class TestYieldMethod {

	public static void main(String[] args) {

		TestYieldExp t1 = new TestYieldExp();
		TestYieldExp t2 = new TestYieldExp();

		t1.setPriority(5);
		t2.setPriority(1);
//	this will  call run() method

		t1.start();
		t2.start();

		for (int i = 0; i < 3; i++) {

			// Control passes to child thread
			t1.yield();

			System.out.println(Thread.currentThread().getName() + "in contro");
		}
	}
}