package Project1_ProductCategory_Collectios;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ProductFactory {
    private ProductSorter productSorter;
    private String[] foodProducts =  {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};
    int randomIdGenerated;
    List<Integer> randomIdList = new ArrayList<>();

    public ProductFactory(ProductSorter productSorter)
    {
       this.productSorter = productSorter;
    }


    public void createProducts(int amount)
    {
        Random random = new Random();
        for (int i = 1 ; i<= amount ; i++ )
        {
           int randomTypeOfProduct = random.nextInt(3) ;
           switch(randomTypeOfProduct)
           {
               case 0:
               {
                   boolean checkDuplicateId = false;
                  int indexOfProduct = random.nextInt(foodProducts.length) ;
                  String selectedProduct = foodProducts[indexOfProduct];

                  while (!checkDuplicateId)
                  {
                      randomIdGenerated = random.nextInt(151);
                      checkDuplicateId = randomIdList.stream().noneMatch(id -> id.equals(randomIdGenerated));

                  }
                  randomIdList.add(randomIdGenerated);
                  FoodProduct foodProduct = new FoodProduct(selectedProduct,randomIdGenerated);
                  productSorter.sortProduct(foodProduct);
                  break;
               }
               case 1:
               {
                   int indexOfProduct = random.nextInt(healthProducts.length) ;
                   String selectedProduct = healthProducts[indexOfProduct];
                   boolean checkDuplicateId = false;
                   while (!checkDuplicateId)
                   {
                       randomIdGenerated = random.nextInt(151);
                       checkDuplicateId = randomIdList.stream().noneMatch(id -> id.equals(randomIdGenerated));

                   }
                   randomIdList.add(randomIdGenerated);
                   HealthProduct healthProduct = new HealthProduct(selectedProduct,randomIdGenerated);
                   productSorter.sortProduct(healthProduct);
                   break;
               }
               case 2:
               {
                   boolean checkDuplicateId = false;
                   int indexOfProduct = random.nextInt(electricProducts.length) ;
                   String selectedProduct = electricProducts[indexOfProduct];
                   while (!checkDuplicateId)
                   {
                       randomIdGenerated = random.nextInt(151);
                       checkDuplicateId = randomIdList.stream().noneMatch(id -> id.equals(randomIdGenerated));
                   }
                   randomIdList.add(randomIdGenerated);
                   ElectricProduct electricProduct = new ElectricProduct(selectedProduct,randomIdGenerated);
                   productSorter.sortProduct(electricProduct);
                   break;
               }


           }

        }
    }

}
