package com.lisun.spring;

/**
 * Created by alekseylisun.
 *
 * @since 27.11.16
 */
public class CargoFlight extends MainFlight {

    public int seats = 12;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
