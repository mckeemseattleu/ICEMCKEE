package ICE8Pack;

public class Student {
    private int age;
    private String name;
    private int gradYear;

    public Student(int age, String name, int gradYear) {
        this.age = age;
        this.name = name;
        this.gradYear = gradYear;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", gradYear=" + gradYear + "]";
    }
}
