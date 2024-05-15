package services;

public class BrazilInterestService implements InterestService {
    private double interestRate;
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


}
