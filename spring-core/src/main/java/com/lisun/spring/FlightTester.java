package com.lisun.spring;

/**
 * Created by alekseylisun.
 *
 * @since 27.11.16
 */
public class FlightTester {

    public static void main(String[] args) {

        MainFlight flight = new MainFlight();

        CargoFlight cargoFlight = new CargoFlight();

        flight = cargoFlight;

        System.out.println(cargoFlight.getSeats());
        System.out.println(cargoFlight.seats);


        System.out.println(flight.getSeats());
        System.out.println(flight.seats);

    }


}
