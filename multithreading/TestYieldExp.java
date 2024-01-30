package com.prowings.multithreading;

public class TestYieldExp extends Thread {

	public void run() {

		for (int i = 0; i < 3; i++)

			System.out.println(Thread.currentThread().getName() + " in control");
	}
}
