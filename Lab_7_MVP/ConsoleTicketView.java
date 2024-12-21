package Lab_7_MVP;

import java.util.List;

class ConsoleTicketView implements TicketView {
    @Override
    public void displayTickets(List<Ticket> tickets) {
        System.out.println("Доступные билеты:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    @Override
    public void showBookingConfirmation(Ticket ticket) {
        System.out.println("Билет успешно забронирован: " + ticket);
    }

    @Override
    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }
}
