package com.prowings.bookmyseatapp;

public class BookMySeatApp {
	
public static void main(String[] args) {
	System.out.println(">>>>>>>>>>");
	
	Theater theater = new Theater();
	
	MyThreadOne t1 = new MyThreadOne(theater, 5);
	MyThreadTwo t2 = new MyThreadTwo(theater, 6);
	
	t1.setName("Ram");
	t2.setName("Sham");
	
	t1.start();
	t2.start();
	
}

}
