package Model;

public class Planes extends Vehicles {
    String Mark;
    String Model;
    int crusingSpeed;
    int prodecedSince;

    public Planes(String name, int numberOfSeats, int range, int weight, String mark, String model, int crusingSpeed, int prodecedSince) {
        super(name, numberOfSeats, range, weight);
        Mark = mark;
        Model = model;
        this.crusingSpeed = crusingSpeed;
        this.prodecedSince = prodecedSince;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getCrusingSpeed() {
        return crusingSpeed;
    }

    public void setCrusingSpeed(int crusingSpeed) {
        this.crusingSpeed = crusingSpeed;
    }

    public int getProdecedSince() {
        return prodecedSince;
    }

    public void setProdecedSince(int prodecedSince) {
        this.prodecedSince = prodecedSince;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                ", crusingSpeed=" + crusingSpeed +
                ", prodecedSince=" + prodecedSince +
                ", numberOfSeats=" + numberOfSeats +
                ", range=" + range +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {
        private String name;
        private int numberOfSeats;
        private int range;
        private int weight;
        private String mark;
        private String model;
        private int crusingSpeed;
        private int producedSince;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
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

        public Builder setCrusingSpeed(int crusingSpeed) {
            this.crusingSpeed = crusingSpeed;
            return this;
        }

        public Builder setProducedSince(int producedSince) {
            this.producedSince = producedSince;
            return this;
        }

        public Planes build() {
            return new Planes(name, numberOfSeats, range, weight, mark, model, crusingSpeed, producedSince);
        }
    }
}
