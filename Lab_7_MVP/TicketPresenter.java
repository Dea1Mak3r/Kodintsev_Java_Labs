package Lab_7_MVP;

import java.util.List;

class TicketPresenter {
    private TicketView view;
    private List<Ticket> tickets;

    public TicketPresenter(TicketView view, List<Ticket> tickets) {
        this.view = view;
        this.tickets = tickets;
    }

    public void showTickets() {
        if (tickets.isEmpty()) {
            view.showError("Билеты отсутствуют.");
        } else {
            view.displayTickets(tickets);
        }
    }

    public void bookTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                view.showBookingConfirmation(ticket);
                return;
            }
        }
        view.showError("Билет с таким ID не найден.");
    }
}
