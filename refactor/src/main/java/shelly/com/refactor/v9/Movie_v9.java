package shelly.com.refactor.v9;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

public class Movie_v9 {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public Movie_v9(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }
    private String _title;
//    private int _priceCode;
    private Price _price;

    public double getCharge(int dayRented) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (dayRented > 2) {
                    result += (dayRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += dayRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (dayRented > 3) {
                    result += (dayRented - 3) * 1.5;
                    break;
                }
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewRealeasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return _title;
    }
}
