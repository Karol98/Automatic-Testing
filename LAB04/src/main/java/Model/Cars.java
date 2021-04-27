package Model;

public class Cars extends Vehicles {
    String name;
    String mark;
    String model;
    int maxSpeed;
    int yearOfProduction;

    public Cars(String name, int numberOfSeats, int range, int weight, String mark, String mode, int maxSpeed, int yearOfProduction) {
        super(name, numberOfSeats, range, weight);
        this.mark = mark;
        this.model = mode;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Mark='" + mark + '\'' +
                ", Mode='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                ", numberOfSeats=" + numberOfSeats +
                ", range=" + range +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private final String name;
        private int numberOfSeats;
        private int range;
        private int weight;
        private String mark;
        private String model;
        private int maxSpeed;
        private int yearOfProduction;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder setRange(int range) {
            this.range = range;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public Cars build() {
            return new Cars(name, numberOfSeats, range, weight, mark, model, maxSpeed, yearOfProduction);
        }
    }
}
