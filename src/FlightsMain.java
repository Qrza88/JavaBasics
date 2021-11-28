import flights.Flight;
import flights.Passenger;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FlightsMain {
    public static void main(String[] args) {
        Flight toParis = new Flight("Wrocław", "Paris", 355.9, LocalDateTime.of(2021,12,23,12,35),234);
        Passenger me = new Passenger("Arleta", "Kurkiewicz",33,"kobieta");
        toParis.addPassenger(me);
        System.out.println(Arrays.toString(toParis.getPassengersList()));
    }
}
