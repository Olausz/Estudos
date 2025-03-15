package Exercicio1Ver3.model;



import Exercicio1Ver3.model.Entities.Reservation;
import Exercicio1Ver3.model.Exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            Integer roomnNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomnNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Update Date Reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation + "+ reservation);
        }

        catch (ParseException e) {
            System.out.println("Invalid date format ");
        }

        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }

        catch (RuntimeException e) {
            System.out.println("error!");
        }

    }
}
