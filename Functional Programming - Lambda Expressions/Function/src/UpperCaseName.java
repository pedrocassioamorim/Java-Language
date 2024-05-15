import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    //Implementando Interface Function
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
