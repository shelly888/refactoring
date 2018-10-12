package shelly.com.refactor.v10;


public class Rental_v10 {
    private Movie_v10 _movie;
    private int _daysRented;

    public Rental_v10(Movie_v10 movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie_v10 getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public double getCharge() {
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
