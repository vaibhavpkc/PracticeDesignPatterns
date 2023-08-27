package Structural.AdapterDesignPattern;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        System.out.println(studentList.get(0).getEmail());
    }
}
