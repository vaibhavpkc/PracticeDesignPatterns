package Creational.FactoryDesignPattern.Example1;

public class LLD extends CourseFactory {
    @Override
    public void createCourse() {
        modules.add(new IntroModule() );
        modules.add(new ExcerciseModule() );
        modules.add(new SummaryModule() );
    }
}
