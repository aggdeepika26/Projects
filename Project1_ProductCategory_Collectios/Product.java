package Project1_ProductCategory_Collectios;

public class Product {
    private String name;
    private int productId;
    public Product()
    {}
    public Product(String name , int productId)
    {
        this.name = name;
        this.productId = productId;

    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }


    @Override
    public String toString() {
        return
                name + " "+ productId;
    }
}
