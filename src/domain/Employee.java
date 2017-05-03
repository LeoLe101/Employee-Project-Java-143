package domain;

/**
 *
 * @author Phuc Hong Le
 */
public class Employee {
    
    //fields
    private int employeeId;
    private String lastName;
    private String firstName;
    
    public Employee(int employeeId, String lastName, String firstName){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.employeeId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return employeeId + ": " + lastName + ", " + firstName;
    }
    
    
}
