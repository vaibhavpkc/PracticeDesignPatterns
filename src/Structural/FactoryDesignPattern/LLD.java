package Structural.FactoryDesignPattern;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new IntroModule() );
        modules.add(new ExcerciseModule() );
        modules.add(new SummaryModule() );
    }
}
