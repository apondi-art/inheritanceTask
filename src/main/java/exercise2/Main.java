package exercise2;

public class Main {
    public static void main(String[] args) {
        Truck firstTruck = new Truck("yellow","Toyota");
        Bike firstBike = new Bike("red","buffalo");
        firstTruck.move();
        firstBike.move();
        System.out.println(firstTruck);
        System.out.println(firstBike);

    }


}
