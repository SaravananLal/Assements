package com.mindtree.Ass3;
/*
 * 29/11/2022- Assesment-3
 * MovieBooking
 * Saravanan
 */

import java.util.Scanner;

public class movieBooking {

	static movieData movieData;

	public static int calculateTicketAmount(int tickid, int ticketNo) {
		int tickCount;
		movieData = new movieData();
		tickCount = movieData.baseFare(tickid) * ticketNo;
		return tickCount;
	}

	public static void main(String args[]) throws Exception {

		Scanner scinput = new Scanner(System.in);
		System.out.println("Please Enter the Movie Id and Total Ticket Count\n 101-Silver \n 102-Gold \n 103-Diamond\n");
		System.out.println("Please enter movie Id:");
		int movieid = scinput.nextInt();
		System.out.println("Please enter number of ticket required:");
		int ticcount = scinput.nextInt();

		if (movieid == 0) {
			throw new Exception("Sorry Your Input on Movie Id is not Valid! Please Try Again");
		} else if (ticcount == 0) {
			throw new Exception("Sorry Your Input on Ticket Count is not Valid! Please Try Again");
		} else if (movieid == 0 || ticcount == 0) {
			throw new Exception("Sorry Your Input are not Valid! Please Try Again");
		} else {
			System.out.println("Movie Tickets Booked Successfully!");
			System.out.println(calculateTicketAmount(movieid, ticcount));
		}
	}
}
