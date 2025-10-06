public class Ticket {
    private int id;
    private Visitor visitor;
    private Attraction attraction;
    private double price;
    private String date;

    public Ticket(int id, Visitor visitor, Attraction attraction, double price, String date) {
        this.id = id;
        this.visitor = visitor;
        this.attraction = attraction;
        this.price = price;
        this.date = date;
    }

    public void useTicket() {}
    public void refund() {}

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", visitor=" + visitor +
                ", attraction=" + attraction +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
