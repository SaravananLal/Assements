package com.mindtree.Ass3;

public class movieData {

	int movieId;
	int fare = 0;
	int ticketcost = 0;

	public int baseFare(int id) {

		if (id == 101) {
			ticketcost = 120;

		} else if (id == 102) {
			ticketcost = 150;
		} else if (id == 103) {
			ticketcost = 170;
		}
		return ticketcost;
	}

}
