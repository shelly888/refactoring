package shelly.com.refactor.v5;

import java.util.Enumeration;
import java.util.Vector;

import shelly.com.refactor.original.Movie;
import shelly.com.refactor.v3.Rental_v3;

public class Customer_v5 {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer_v5(String name) {
        this._name = name;
    }

    public void addRental(Rental_v3 rental) {
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
            Rental_v3 each = (Rental_v3) rentals.nextElement();
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;
            result += "\t" + each.getMovie().getTitle() + "\t\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }
        result += "Amount owed:  " + String.valueOf(totalAmount) + "\n";
        result += "Renter points: " + String.valueOf(frequentRenterPoints);
        return result;
    }
}
