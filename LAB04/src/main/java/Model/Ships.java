package Model;

public class Ships extends Vehicles {
    int maxSpeed;
    int totalLenght;
    int enginePower;

    public Ships(String name, int numberOfSeats, int range, int weight, int maxSpeed, int totalLenght, int enginePower) {
        super(name, numberOfSeats, range, weight);
        this.maxSpeed = maxSpeed;
        this.totalLenght = totalLenght;
        this.enginePower = enginePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTotalLenght() {
        return totalLenght;
    }

    public void setTotalLenght(int totalLenght) {
        this.totalLenght = totalLenght;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Ships{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", totalLenght=" + totalLenght +
                ", enginePower=" + enginePower +
                ", numberOfSeats=" + numberOfSeats +
                ", range=" + range +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private int numberOfSeats;
        private int range;
        private int weight;
        private String name;
        private int maxSpeed;
        private int totalLenght;
        private int enginePower;

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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setTotalLenght(int totalLenght) {
            this.totalLenght = totalLenght;
            return this;
        }

        public Builder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Ships build() {
            return new Ships(name, numberOfSeats, range, weight, maxSpeed, totalLenght, enginePower);
        }
    }
}
