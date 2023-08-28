package Creational.AbstractFactory;

public class IvyLeagueUniversityFactory extends UniversityFactory{

    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math":
                return new MITAdmitCard();
            case "CS":
                return new CalTechAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch(course){
            case "Math":
                return new MITFeeCalculator();
            case "CS":
                return new CalTechFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
