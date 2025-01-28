package circularlinkedlist.onlineticketreservationsystem;

public class Main {
    public static void main(String[] args) {
        ReservationList ticketSystem = new ReservationList();

        ticketSystem.bookTicket(1, "Rahul Kumar", "RRR", "A1", "2025-01-28 10:00");
        ticketSystem.bookTicket(2, "Priya Sharma", "Kabir Singh", "B2", "2025-01-28 12:00");
        ticketSystem.bookTicket(3, "Arjun Patel", "Baahubali", "C3", "2025-01-28 14:00");

        System.out.println("All booked tickets:");
        ticketSystem.showTickets();

        System.out.println("\nSearching for a ticket by customer 'Priya Sharma':");
        ticketSystem.searchTicket("Priya Sharma");

        System.out.println("\nSearching for a ticket for 'Kabir Singh':");
        ticketSystem.searchTicket("Kabir Singh");

        System.out.println("\nCancelling ticket with ID 2:");
        ticketSystem.cancelTicket(2);

        System.out.println("\nAll booked tickets after cancellation:");
        ticketSystem.showTickets();

        System.out.println();
        ticketSystem.totalBookings();
    }

}
