package Creational.AbstractFactory.Example1;

public abstract class UniversityFactory {
    private static int cutoff = 109;

    public static UniversityFactory getUniversityFactory(int score){

        if(score>cutoff){
            return new IvyLeagueUniversityFactory();
        }else{
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String course);
    public abstract FeeCalculator getFeeCalculator(String course);
}

