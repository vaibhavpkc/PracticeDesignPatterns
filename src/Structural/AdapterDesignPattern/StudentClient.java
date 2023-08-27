package Structural.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        CollegeStudent clgStudent = new CollegeStudent("a","b","c");
        SchoolStudent scSt = new SchoolStudent("x","y","z");
        students.add(clgStudent);
//        using Adapter class to convert the SchoolStudent object as the object of Student Interface.
        students.add(new SchoolStudentAdapter(scSt));
        return students;
    }


}
