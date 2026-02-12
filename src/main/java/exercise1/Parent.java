package exercise1;

public class Parent {
    String color;

    public Parent(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "color='" + color + '\'' +
                '}';
    }
}
