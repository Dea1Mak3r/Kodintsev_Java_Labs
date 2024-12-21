package Lab_7_MVP;

import java.util.Arrays;
import java.util.List;

public class Lab7_Task2 {
    public static void main(String[] args) {
        List<Ticket> tickets = Arrays.asList(
                new Ticket(1, "New York", 5000.0),
                new Ticket(2, "Los Angeles", 4050.0),
                new Ticket(3, "Chicago", 4000.0)
        );

        TicketView view = new ConsoleTicketView();

        TicketPresenter presenter = new TicketPresenter(view, tickets);

        presenter.showTickets();

        // Бронируем билет с айдишником 2
        presenter.bookTicket(2);

        // Пытаемся заборнировать билет с несуществующим айдишником
        presenter.bookTicket(5);
    }
}
