
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (otherApartment.squareMeters < this.squareMeters) {
            return true;
        } else {
            return false;
        }

    }

    public int priceDifference(Apartment otherApartment) {
        int priceDifference = 0;
        int priceOne = this.pricePerSquareMeter * this.squareMeters;
        int priceTwo = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (priceOne > priceTwo) {
            priceDifference = priceOne - priceTwo;
        } else {
            priceDifference = priceTwo - priceOne;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        int priceOne = this.pricePerSquareMeter * this.squareMeters;
        int priceTwo = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (priceOne > priceTwo) {
            return true;
        } else {
            return false;
        }
    }

}
