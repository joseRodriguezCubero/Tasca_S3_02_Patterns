package n3exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Shoes", 50);
        Product product2 = new Product("T-shirt", 25);
        Product product3 = new Product("Bag", 40);
        Product product4 = new Product("Laptop", 100);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);


        Item item = new Item(new ListItems(products), new ConverterDollars());
        item.showItems();

        Item item2 = new Item(new ListItems(products), new ConverterDollars());
        item2.showItems();
    }
}
