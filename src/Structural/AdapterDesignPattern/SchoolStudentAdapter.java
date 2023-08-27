package Structural.AdapterDesignPattern;

/**
 * This is the adapter class which forms a bridge between a class which doesn't implement a interface which is understood by the main class when it
 * adds into the list of interface object. Example:
 *
 * List<Student> students =new ArrayList();
 * SchoolStudent sc = new SchoolStudent("x","y","z");
 * students.add(sc);  ----> This line gives error as the SchoolStudent doesn't implement Student interface
 * and hence is not of the subtype Student. This is why SchoolStudentAdapter comes into picture to form the bridge so, that students.add(sc)
 * will not throw an error.
 */
public class SchoolStudentAdapter implements Student{

//    Declaring the SchoolStudent Object.
    private SchoolStudent scStudent;

    public SchoolStudentAdapter(SchoolStudent scStudent) {
        this.scStudent = scStudent;
    }

    @Override
    public String getName() {
        return this.scStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return this.scStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.scStudent.getEmailAddress();
    }
}
