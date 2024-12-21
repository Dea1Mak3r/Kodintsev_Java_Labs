package Lab_7_MVP;

import java.util.List;

interface TicketView {
    void displayTickets(List<Ticket> tickets);
    void showBookingConfirmation(Ticket ticket);
    void showError(String message);
}
