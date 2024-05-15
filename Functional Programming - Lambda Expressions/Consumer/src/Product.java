public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }
    // Implementação com Reference Method com método Estático:
    public static void staticPriceUpDate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    //Implementação com método não estático:

    public void nonStaticUpDate(){
        price = price * 1.1;
    }
}
