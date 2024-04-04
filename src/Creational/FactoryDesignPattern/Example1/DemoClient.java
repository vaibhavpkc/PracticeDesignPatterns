package Creational.FactoryDesignPattern.Example1;

//In Factory Pattern you are creating a factory class which has the return type of another class whose objects you want.

/**
 * In Factory design pattern there is a interface or an abstract class
 * which abstracts the implementation layer from the client which is then implemented by
 * the concrete classes present beneath the interface.
 *
 * We create an object of abstract class and have the reference of the abstract Class factory
 * which further processes and invokes the required class which extends the abstract class.
 */
public class DemoClient {
    public static void main(String[] args) {
        CourseFactory hldCourse = CourseFactory.getCourse("HLD");
        CourseFactory lldCourse = CourseFactory.getCourse("LLD");

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
