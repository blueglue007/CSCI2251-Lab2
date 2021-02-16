public class RentalProperty implements Payment {
    String propertyType;
    String rentalID;
    double rental;

    public RentalProperty(String propertyType, String rentalID, Double rental) {
        this.propertyType = propertyType;
        this.rentalID = rentalID;
        this.rental = rental;
    }

    public String getrentalID(){
        return rentalID;
    }

    public Double getrental(){
        return rental;
    }

    @Override
    public double outputCurrentRent() {
        return 0;
    }

}