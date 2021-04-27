package Model;

public abstract class Vehicles {
    String name;
    int numberOfSeats;
    int range;
    int weight;

    public Vehicles(String name, int numberOfSeats, int range, int weight) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.range = range;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
