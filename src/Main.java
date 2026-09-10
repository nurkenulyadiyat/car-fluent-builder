public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setBrand("Geely")
                .setModel("Monjaro")
                .setYear(2026)
                .setColor("white")
                .build();

        System.out.println(car);

    }
}
