package com.prowings.bookmyseatapp;

public class Theater {

	int totalSeats = 10;

	public synchronized void bookSeats(int seats) {
		System.out.println("hii : "+Thread.currentThread().getName());
		System.out.println("hii : "+Thread.currentThread().getName());
		System.out.println("hii : "+Thread.currentThread().getName());
		
		if (seats <= totalSeats) {
			System.out.println( seats +" "+"seats booked successfully by :" + Thread.currentThread().getName());

			totalSeats = totalSeats - seats;

			System.out.println("Remaining seats after booking : " + totalSeats);
		} else

		{
			System.out.println("Can not book : " + seats + " seats..Available seats are : " + totalSeats);

		}
		System.out.println("hello : "+Thread.currentThread().getName());
		System.out.println("hello : "+Thread.currentThread().getName());
		System.out.println("hello : "+Thread.currentThread().getName());
	}

}
