import java.util.function.Consumer;

public class PriceUpDate implements Consumer<Product>
{
    @Override
    public void accept(Product product) {

        product.setPrice(product.getPrice() * 1.1);

    }
}
