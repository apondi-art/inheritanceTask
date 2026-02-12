package exercise2;

public class Vehicle {
    String color, brand;

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    void move(){
        System.out.println("vehicle is moving");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
