package hotel_reservation;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Room {
    private int number;
    private int numberOfBeds;
    private String[] features;
    private int pricePerNight;
    private List<Booking> bookings;

    public Room(int number, int numberOfBeds, String[] features, int pricePerNight) {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.features = Arrays.copyOf(features);
        this.pricePerNight = pricePerNight;

        this.bookings = new ArrayList<Booking>();
    }

    public int getNumber() { return this.number; }

    public int getNumberOfBeds() { return this.numberOfBeds; }

    public String[] getFeatures() { return Arrays.copyOf(this.features); }

    public int getPricePerNight() { return this.pricePerNight; }

    public Booking bookRoom(Calendar startDate, Calendar endDate, int people) {
        if (!this.isAvailable(startDate, endDate)) {
            // Throw exception!
        }

        Booking booking = new Booking(this, startDate, endDate, people);
        this.bookings.add(booking);
        return booking;
    }

    public int removeBooking(Booking booking) {
        this.bookings.remove(bookings);
    }

    public boolean isAvailable(Calendar startDate, Calendar endDate) {
        for (Booking booking : this.booking) {
            if (booking.dateCollidesWithBooking(startDate) || booking.dateCollidesWithBooking(endDate)) {
                return false;
            }
        }

        return true;
    }
}

