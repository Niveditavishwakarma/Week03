package circularlinkedlist.onlineticketreservationsystem;

class ReservationList {
        private TicketNode head;

        public ReservationList() {
            this.head = null;
        }

        public void bookTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
            if (head == null) {
                head = newTicket;
                newTicket.next = head;
            } else {
                TicketNode temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newTicket;
                newTicket.next = head;
            }
        }

        public void cancelTicket(int ticketId) {
            if (head == null) {
                System.out.println("No tickets available to cancel.");
                return;
            }

            TicketNode temp = head;
            TicketNode prev = null;

            do {
                if (temp.ticketId == ticketId) {
                    if (prev != null) {
                        prev.next = temp.next;
                    } else {

                        if (temp.next == head) {
                            head = null;
                        } else {
                            head = temp.next;
                            prev = temp;
                            while (prev.next != temp) {
                                prev = prev.next;
                            }
                            prev.next = head;
                        }
                    }
                    System.out.println("Ticket with ID " + ticketId + " has been canceled.");
                    return;
                }
                prev = temp;
                temp = temp.next;
            } while (temp != head);

            System.out.println("Ticket with ID " + ticketId + " not found.");
        }

        public void showTickets() {
            if (head == null) {
                System.out.println("No tickets available.");
                return;
            }

            TicketNode temp = head;
            do {
                System.out.println("Ticket ID: " + temp.ticketId + ", Customer Name: " + temp.customerName +
                        ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber +
                        ", Booking Time: " + temp.bookingTime);
                temp = temp.next;
            } while (temp != head);
        }

        public void searchTicket(String searchTerm) {
            if (head == null) {
                System.out.println("No tickets available.");
                return;
            }

            TicketNode temp = head;
            boolean found = false;
            do {
                if (temp.customerName.equalsIgnoreCase(searchTerm) || temp.movieName.equalsIgnoreCase(searchTerm)) {
                    System.out.println("Ticket ID: " + temp.ticketId + ", Customer Name: " + temp.customerName +
                            ", Movie Name: " + temp.movieName + ", Seat Number: " + temp.seatNumber +
                            ", Booking Time: " + temp.bookingTime);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);

            if (!found) {
                System.out.println("No tickets found for the search term: " + searchTerm);
            }
        }

        public void totalBookings() {
            if (head == null) {
                System.out.println("No tickets booked.");
                return;
            }

            int count = 0;
            TicketNode temp = head;
            do {
                count++;
                temp = temp.next;
            } while (temp != head);

            System.out.println("Total number of booked tickets: " + count);
        }
}
