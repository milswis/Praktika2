public class Visitor {
    private int id;
    private String name;
    private int age;

    public Visitor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void buyTicket(Ticket ticket) {}
    public void visitAttraction(Attraction attraction) {}

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
