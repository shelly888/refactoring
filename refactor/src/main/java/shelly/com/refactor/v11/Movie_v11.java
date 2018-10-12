package shelly.com.refactor.v11;

public class Movie_v11 {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public Movie_v11(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }
    private String _title;
    private Price _price;

    public double getCharge(int dayRented) {
        return _price.getCharge(dayRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    private void setPriceCode(int priceCode) {
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
