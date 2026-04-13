public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Step 12.1: Add default frequent renter points method
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}