package com.prowings.bookmyseatapp.staticsync;

public class Theater {

	static int totalSeats = 10;

	public static synchronized void bookSeats(int seats) {

		if (seats <= totalSeats) {
			System.out.println(seats +" "+ "Seats booked successfully by :" + Thread.currentThread().getName());

			totalSeats = totalSeats - seats;

			System.out.println("Remaining seats after booking : " + totalSeats);
		} else {
			System.out.println("Can not book :" + seats + "seats..Available seats are : " + totalSeats);
		}
	}

}
