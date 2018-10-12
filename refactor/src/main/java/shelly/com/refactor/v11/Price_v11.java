package shelly.com.refactor.v11;

import shelly.com.refactor.original.Movie;

abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int dayRented);
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
    double getCharge (int dayRented) {
        double result = 1.5;
        if (dayRented > 3) {
            result += (dayRented - 3) * 1.5;
        }
        return  result;
    }
}
class NewRealeasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    double getCharge (int dayRented) {
        return dayRented * 3;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
    double getCharge (int dayRented) {
        double result = 2;
        if (dayRented > 2) {
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }
}
