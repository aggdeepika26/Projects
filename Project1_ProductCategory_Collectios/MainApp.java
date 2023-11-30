package Project1_ProductCategory_Collectios;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);
        productFactory.createProducts(100);



        System.out.println("List of Food Products");
        List<FoodProduct> listFoodProduct = productSorter.getFoodProducts();
        System.out.println(listFoodProduct);
        System.out.println("Total no of food Items in the list  ;" + (long) listFoodProduct.size());
        System.out.println("**************************************************** \n");

        System.out.println("List of Electric Products");
        List<ElectricProduct> listElectricProduct  = productSorter.getElectricProducts();
        System.out.println(listElectricProduct);
        System.out.println("Total no of electric products in the list  ;" + (long) listElectricProduct.size());
        System.out.println("**************************************************** \n");

        System.out.println("List of Health Products");
        List<HealthProduct> listHealthProduct = productSorter.getHealthProducts();
        System.out.println(listHealthProduct);
        System.out.println("Total no of Health products in the list  ;" + (long) listHealthProduct.size());


    }
}
