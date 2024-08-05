package ICE4Pack;

public class Employee {
    private String firstName;
    private String lastName;
    private int pay;

    public Employee(String firstName, String lastName, int pay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pay = pay;
    }
    public String toString() {
        String s = "Name is " + firstName + " " + lastName + ": " + pay;

        return s;
    }
    public Employee copy(){
        Employee employee2 = new Employee(firstName, lastName, pay);

        return employee2;
    }
    public Boolean equals(Employee employee2) {
        if (this.firstName.equals(employee2.firstName) && this.lastName.equals(employee2.lastName)
                && this.pay == employee2.pay) {
            return true;
        } else {
            return false;
        }
    }
}
