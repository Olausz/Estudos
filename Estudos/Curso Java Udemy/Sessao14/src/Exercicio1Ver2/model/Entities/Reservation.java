package Exercicio1Ver2.model.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        Long diff = checkin.getTime() - checkout.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkout) {
        Date now = new Date();
        if (checkIn.before(now) || checkout.before(now)) {
            System.out.println("Error in reservation: The reservation dates must be one of future dates!");
        }
        else if (!checkout.after(checkIn)) {
            System.out.println("Error in reservation: Check-Out date must be after Check-In date!");
        }

        this.checkin = checkIn;
        this.checkout = checkout;
        return null;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkin)
                + ", check-out"
                + sdf.format(checkout)
                + ", "
                + duration()
                + " nights";
    }
}
