public class Park {
    private int id;
    private String name;
    private String location;
    private int foundedYear;

    public Park(int id, String name, String location, int foundedYear) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public void openPark() {}
    public void closePark() {}
    public void addAttraction(Attraction attraction) {}

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", foundedYear=" + foundedYear +
                '}';
    }
}
