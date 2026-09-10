public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{brand=" + brand + ", model=" + model +
                ", year=" + year + ", color=" + color + "}";
    }

    public static class Builder {
        private String brand = "Toyota";
        private String model = "Camry 75";
        private int year = 2023;
        private String color = "white";

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            if (brand == null || brand.isEmpty()) {
                throw new IllegalStateException("brand is required");
            }
            return new Car(this);
        }
    }
}