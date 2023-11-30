package Project1_ProductCategory_Collectios;

import java.util.ArrayList;
import java.util.List;

public class ProductSorter {
  private  List<Product> products = new ArrayList<>();
  private  List<FoodProduct> foodProducts = new ArrayList<>();

  private List<HealthProduct> healthProducts = new ArrayList<>();
  private   List<ElectricProduct> electricProducts = new ArrayList<>();
  public List<FoodProduct> getFoodProducts()
  {
   return foodProducts;
  }
  public List<HealthProduct>  getHealthProducts()
  {
   return  healthProducts;
  }

  public List<ElectricProduct> getElectricProducts()

  {
    return  electricProducts;

  }

  public void sortProduct(Product productItem)
  {
    products.add(productItem);

    if(productItem instanceof FoodProduct)
    {
      foodProducts.add((FoodProduct) productItem);
    }
    else if (productItem instanceof HealthProduct)
    {
      healthProducts.add((HealthProduct) productItem);
    }
    else
    {
      electricProducts.add((ElectricProduct)productItem);
    }
  }
}
