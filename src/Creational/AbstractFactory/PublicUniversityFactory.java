package Creational.AbstractFactory;

public class PublicUniversityFactory extends UniversityFactory{
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math":
                return new USCAdmitCard();
            case "CS":
                return new ASUAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course){
            case "Math":
                return new USCFeeCalculator();
            case "CS":
                return new ASUFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
