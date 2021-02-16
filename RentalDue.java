import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class RentalDue {
    File file = new File("rentalDB.txt");
    ArrayList<RentalProperty> ApartmentRental = new ArrayList<>();
    ArrayList<RentalProperty> SingleFamilyRental = new ArrayList<>();

    public void InputFile() {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String ID = sc.next();
                String propertyType = sc.next();
                String propertyID = sc.next();
                int roomNumber = sc.nextInt();
                double rental = sc.nextDouble();
                if (propertyType.equals("A")) {
                    ApartmentRental.add(new ApartmentRental(propertyType, propertyID, rental));
                } else if (propertyType.equals("S")) {
                    SingleFamilyRental.add(new SingleFamilyRental(propertyType, propertyID,rental));
                }


            }
        } catch (Exception ex) {
            System.out.print("File does not exist");
        }
    }


    public void PrintArray(){
        Collections.sort(ApartmentRental, new SortbyRentalID());
        Collections.sort(SingleFamilyRental, new SortbyRentalID());
        System.out.println("\nSingle-Family Rental Summary:\nHouse ID Number    Rental Due\n===============    ==========");
        for (int i = 0; i < SingleFamilyRental.size(); i++) {
            System.out.printf("%s            %.2f\n",SingleFamilyRental.get(i).getrentalID(),SingleFamilyRental.get(i).outputCurrentRent());
        }

        System.out.println("\nApartment rental Summary:\nApartment ID No.    Rental Due\n===============    ==========");
        for (int j = 0; j < ApartmentRental.size(); j++) {
            System.out.printf("%s            %.2f\n",ApartmentRental.get(j).getrentalID(),ApartmentRental.get(j).outputCurrentRent());
        }
    }

}
