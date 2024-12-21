package Lab_7_MVP;

class Ticket {
    private int id;
    private String destination;
    private double price;

    public Ticket(int id, String destination, double price) {
        this.id = id;
        this.destination = destination;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}
