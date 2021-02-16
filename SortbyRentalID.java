import java.util.Comparator;

public class SortbyRentalID implements Comparator<RentalProperty>
{
    @Override
    public int compare(RentalProperty a, RentalProperty b) {
        return a.getrentalID().compareToIgnoreCase(b.getrentalID());
    }
}