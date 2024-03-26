package JDBC;

import JDBC.models.Brewer;
import JDBC.repositories.BeerRepository;
import JDBC.repositories.BrewerRepository;
import JDBC.repositories.CategoryRepository;

public class MainApp {
    public static void main(String[] args) {
        CategoryRepository categoryRepository =  new CategoryRepository();
        categoryRepository.read();
        categoryRepository.createRecord();
        categoryRepository.deleteRecord();
        categoryRepository.updateRecord();


        BrewerRepository brewerRepository =  new BrewerRepository();
        brewerRepository.read();
        brewerRepository.createRecord();
        brewerRepository.updateRecord();
        brewerRepository.deleteRecord();

        BeerRepository beerRepository =  new BeerRepository();
        beerRepository.read();
        beerRepository.createRecord();
        beerRepository.updateRecord();
        beerRepository.deleteRecord();


    }
}
