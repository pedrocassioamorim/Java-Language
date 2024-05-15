import model.entites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room Number:");
        int roomNumber = sc.nextInt();

        System.out.println("Check-In Date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-Out Date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in Reservation: Check-Out Date must be after Check-In Date.");
        }
        else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-In Date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.println("Check-Out Date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();

            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.println("Error in Reservation: Reservation Dates must be future dates.");
            }
            else if (!checkOut.after(checkIn)) {
                System.out.println("Error in Reservation: Check-Out Date must be after Check-In Date.");
            }
            else {
                reservation.updateDates(checkIn,checkOut);
                System.out.println("Reservation: " + reservation);
            }





        }









        sc.close();
    }
}