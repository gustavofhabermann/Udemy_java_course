package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    default double payment(double amont, int months){
        if(months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amont * Math.pow(1.0 + (getInterestRate()/100), months);
    }

}
