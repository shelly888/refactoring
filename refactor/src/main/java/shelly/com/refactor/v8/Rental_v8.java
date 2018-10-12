package shelly.com.refactor.v8;

import shelly.com.refactor.original.Movie;

public class Rental_v8 {
    private Movie_v8 _movie;
    private int _daysRented;

    public Rental_v8(Movie_v8 movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie_v8 getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public double getCharge() {
//        double result = 0;
//        switch (getPriceCode()) {
//            case REGULAR:
//                ...
//            case NEW_RELEASE:
//                ...
//            case CHILDRENS:
//                ...
//        }
//        return result;
        return getMovie().getCharge(_daysRented);
    }
    public int getFrequentRenterPoints() {
//        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
//            return 2;
//        } else {
//            return 1;
//        }
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }
}
