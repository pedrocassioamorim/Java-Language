package services;

public class USAInterestService implements InterestService {
    private double interestRate;
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

}
