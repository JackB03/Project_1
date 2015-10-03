package android.fullsail.com.project_1;

/**
 * Created by JackBonner on 10/3/15.
 */
public class Employee {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
