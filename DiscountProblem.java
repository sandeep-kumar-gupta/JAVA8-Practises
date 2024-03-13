import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DiscountProblem {
    public static void main(String[] args) {

        List<Double> products = new ArrayList<>();
        products.add(20.0);
        products.add(30.0);
        products.add(25.0);

        double highestPrice = Collections.max(products);
        double discount = highestPrice * 0.10;

        double totalAmount = products.stream().mapToDouble(price->(price == highestPrice) ? price - discount :price)
        .sum();

        System.out.printf("total amount = "+totalAmount);

    }


}
