package Creational.FactoryDesignPattern;

//In Factory Pattern you are creating a factory class which has the return type of another class whose objects you want.

/**
 * In Factory design pattern there is a interface which abstracts the implementation layer from the client which is then implemented by
 * the concrete classes present beneath the interface.
 */
public class DemoClient {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse!=null;
        System.out.println("HLD Modules: ");
//        System.out.println(hldCourse.modules);
        System.out.println(hldCourse.getModules());
        assert lldCourse!=null;
        System.out.println("LLD Modules: ");
//        System.out.println(lldCourse.modules);
        System.out.println(lldCourse.getModules());
    }
}
