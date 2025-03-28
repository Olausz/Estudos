package Exercicio1.model;

import Exercicio1.model.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        Integer roomnNumber = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-Out date must be after Check-In date!");
        }
        else {
            Reservation reservation = new Reservation(roomnNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Update Date Reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
             checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
             checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in reservation: The reservation dates must be one of future dates!");
            }
            else if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation: Check-Out date must be after Check-In date!");
            }
            else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }



    }
}
