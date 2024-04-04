package Creational.FactoryDesignPattern.Example1;

public class HLD extends CourseFactory{

    @Override
    public void createCourse(){
        modules.add(new IntroModule() );
        modules.add(new DemoModule() );
        modules.add(new SummaryModule() );
    }
}

