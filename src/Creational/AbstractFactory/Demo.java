package Creational.AbstractFactory;

/**
 * Abstract factory is a factory of Factory design pattern where it
 * creates objects which belong to a family of similar objects, implemented using a common interface.
 *
 * Summary:
 * Pros:
 * Good Abstraction and family of similar objects.
 * Loose coupling between client and actual/concrete code.
 * Every class has the responsibility to instantiate it's objects. So, SRP principle is being implemented.
 * Supports Open Closed Principle.
 *
 * Cons:
 * Code becomes complicated with time and addition of classes.
 * Pattern inside a pattern so becomes difficult to understand.
 */
public class Demo {

    public static void main(String[] args) {
        int entranceExamScore= 125;
//        Abstract Factory class initialized.
        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(entranceExamScore);

        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println(admitCard.getClass());
        FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee());

        AdmitCard admitCard2 = abstractUniversityFactory.getAdmitCard("CS");
        System.out.println(admitCard2.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("CS");
        System.out.println(feeCalculator.calculateFee());


        entranceExamScore= 105;
//        Abstract Factory class initialized.
        UniversityFactory abstractUniversityFactory2 = UniversityFactory.getUniversityFactory(entranceExamScore);
        AdmitCard admitCard3 = abstractUniversityFactory2.getAdmitCard("Math");
        System.out.println(admitCard3.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.calculateFee());

        AdmitCard admitCard4 = abstractUniversityFactory2.getAdmitCard("CS");
        System.out.println(admitCard4.getClass());
        feeCalculator = abstractUniversityFactory.getFeeCalculator("CS");
        System.out.println(feeCalculator.calculateFee());

    }
}
