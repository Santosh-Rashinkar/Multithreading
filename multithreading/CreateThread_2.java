package com.prowings.multithreading;

public class CreateThread_2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("thread task--2");
	}
	
	public static void main(String[] args) {
		
		CreateThread_2 th = new CreateThread_2();
		
		Thread t = new Thread(th);
		
		t.start();
	}

}
