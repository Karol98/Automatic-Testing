import Model.Cars;

public class Main {
    public static void main(String[] args) {
        Cars jacek = new Cars.Builder("Jacek")
                .setMark("BMW")
                .setModel("1")
                .setYearOfProduction(2007)
                .setMaxSpeed(220)
                .build();
        System.out.println(jacek.toString());
    }
}
