package Structural.FactoryDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Abstract methods are declared in abstract parent classes which are then implemented by the child classes.
public abstract class Course {
    protected List<Module> modules = new ArrayList<>();

    public Course(){this.createCourse();}

    public List<Module> getModules(){
        return modules;
    }

//    abstract method thereby hiding the functionality from the client.
    public abstract void createCourse();

}
