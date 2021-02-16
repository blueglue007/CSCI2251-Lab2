public class SingleFamilyRental extends RentalProperty {
    public SingleFamilyRental(String propertyType, String rentalID,Double rental){
        super (propertyType, rentalID,rental);
    }
    public double outputCurrentRent() {
        return super.getrental()*1.04;
    }
}
