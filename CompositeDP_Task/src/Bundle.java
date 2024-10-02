import java.util.ArrayList;
import java.util.List;

public class Bundle implements ECommerceUnits {

    private List<ECommerceUnits> products ;

    public Bundle() {
        products = new ArrayList<>() ;
    }

    public void addECommerceUnit(ECommerceUnits unit) {
        products.add(unit) ;
    }

    @Override
    public double getTotalPrice() {
        return products.stream()
                .mapToDouble(ECommerceUnits::getTotalPrice)
                .sum() ;
    }
}
