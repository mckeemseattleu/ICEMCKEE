package ICE4Pack;

/**
 * @author Michael Hudson, Leona Mang, Troy Kaser
 * version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("First", "Last", 1000000);

        System.out.println(employee1);

        Employee employee2 = employee1.copy();
        System.out.println(employee2);

        System.out.println(employee1.equals(employee2));
    }
}
