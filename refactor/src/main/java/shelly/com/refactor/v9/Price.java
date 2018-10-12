package shelly.com.refactor.v9;

import shelly.com.refactor.original.Movie;

abstract class Price {
    abstract int getPriceCode();
}
class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
class NewRealeasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
