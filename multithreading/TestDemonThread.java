package com.prowings.multithreading;

public class TestDemonThread {

	public static void main(String[] args) {

		MyThreadC t1 = new MyThreadC();
		MyThreadC t2 = new MyThreadC();
		MyThreadC t3 = new MyThreadC();
		
		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
		
//		MyThread mt = new MyThread();
//		mt.run();
//		MyThreadA mt1 = new MyThreadA();
//		mt1.run();
		
	}
	

}
