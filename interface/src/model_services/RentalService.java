package model_services;

import java.time.Duration;

import model_entites.CarRental;
import model_entites.Invoice;

public class RentalService {
    

    private Double priceperHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double priceperHour, Double pricePerDay, TaxService taxService) {
        this.priceperHour = priceperHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = priceperHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
