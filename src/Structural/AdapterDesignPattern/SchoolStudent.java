package Structural.AdapterDesignPattern;

public class SchoolStudent {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public SchoolStudent(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

//    As the SchoolStudent Class doesn't implement the Student interface,
//    we see it has getters implemented below.

//    This is where Adapter design pattern comes into picture to have this class connected with Student interface.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
