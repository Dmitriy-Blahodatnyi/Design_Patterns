package patterns.structural.adapter.employees;

import patterns.structural.adapter.interfaces.Employee;

public class EmployeeDB implements Employee {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;

    public EmployeeDB(String id, String firstName, String lastName,
            String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getEmail() { return email; }

    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}