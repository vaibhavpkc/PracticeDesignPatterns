package Creational.FactoryDesignPattern.Example1;

import java.util.ArrayList;
import java.util.List;

//Course Factory handles the course class.
//Abstract methods are declared in abstract parent classes which are then implemented by the child classes.
public abstract class CourseFactory {
    public static CourseFactory getCourse(String courseType){
        switch (courseType){
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
    protected List<Module> modules = new ArrayList<>();

    public CourseFactory(){this.createCourse();}

    public List<Module> getModules(){
        return modules;
    }

    //    abstract method thereby hiding the functionality from the client.
    public abstract void createCourse();
}
