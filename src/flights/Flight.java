package flights;

import java.time.LocalDateTime;
import java.util.Date;

public class Flight {
    private String startCity;
    private String endCity;
    private double price;
    private LocalDateTime date;
    private int seatsCount;
    private Passenger[] passengersList;

    public Flight(String startCity, String endCity, double price, LocalDateTime date, int seatsCount) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.price = price;
        this.date = date;
        this.seatsCount = seatsCount;
        this.passengersList = new Passenger[seatsCount];
    }

    public void addPassenger(Passenger passenger) {
        int i = 0;
        for (; i < passengersList.length; i++) {
            if (passengersList[i] == null) {
                break;
            }
        }
        if (i == seatsCount) {
            System.out.println("Brak wolnych miejsc");
        } else {
            passengersList[i] = passenger;
        }
    }

    public String getStartCity() {
        return startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public Passenger[] getPassengersList() {
        return passengersList;
    }
}
