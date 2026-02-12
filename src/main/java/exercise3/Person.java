package exercise3;

public class Person {
    String name, course;
    int id;

    public Person(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }
    void takeCourse(){
        System.out.println("taking course");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
