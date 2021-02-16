public class ApartmentRental extends RentalProperty {
    public ApartmentRental(String propertyType, String rentalID, Double rental){
        super (propertyType, rentalID, rental);
    }
    public double outputCurrentRent() {
        return super.getrental()*1.08;
    }
}