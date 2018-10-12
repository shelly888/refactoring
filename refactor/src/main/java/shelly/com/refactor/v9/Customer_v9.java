package shelly.com.refactor.v9;

import java.util.Enumeration;
import java.util.Vector;

public class Customer_v9 {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer_v9(String name) {
        this._name = name;
    }

    public void addRental(Rental_v9 rental) {
        _rentals.addElement(rental);
    }

    private String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental_v9 each = (Rental_v9) rentals.nextElement();
//            frequentRenterPoints += each.getFrequentRenterPoints();
            result += "\t" + each.getMovie().getTitle() + "\t\t" + String.valueOf(each.getCharge()) + "\n";
//            totalAmount += each.getCharge();
        }

//        result += "Amount owed:  " + String.valueOf(totalAmount) + "\n";
//        result += "Renter points: " + String.valueOf(frequentRenterPoints);
        result += "Amount owed:  " + String.valueOf(getTotalCharge()) + "\n";
        result += "Renter points: " + String.valueOf(getTotalFrequentRenterPoints());
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental_v9 each = (Rental_v9) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental_v9 each = (Rental_v9) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
