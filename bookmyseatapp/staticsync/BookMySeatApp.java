package com.prowings.bookmyseatapp.staticsync;

public class BookMySeatApp {

	public static void main(String[] args) {

		Theater theater1 = new Theater();

		Theater theater2 = new Theater();

		MyThreadOne t1 = new MyThreadOne(theater1, 3);

		MyThreadTwo t2 = new MyThreadTwo(theater1, 5);

		t1.setName("Ram");
		t2.setName("sham");
		t1.start();
		t2.start();

		MyThreadOne t3 = new MyThreadOne(theater2, 3);
		MyThreadTwo t4 = new MyThreadTwo(theater2, 5);

		t3.setName("Santosh");
		t4.setName("Sanjay");
		t3.start();
		t4.start();
	}

}
