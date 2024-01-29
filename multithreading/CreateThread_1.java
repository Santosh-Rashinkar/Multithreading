package com.prowings.multithreading;

public class CreateThread_1 extends Thread {

	@Override
	public void run() {
		
		System.out.println("thread task ");
	}
	
	public static void main(String[] args) {
		
		CreateThread_1 th = new CreateThread_1();
		
		Thread t = new Thread(th);
		
		t.start();
//		t.start(); //java.lang.IllegalThreadStateException
//		t.run(); at this time method excuted successfully but thread not created at this time.
	}

}
