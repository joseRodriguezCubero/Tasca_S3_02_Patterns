package n3exercici1;

import java.util.ArrayList;

public class ListItems {

    private ArrayList<Product> products;

    public ListItems(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct (Product product){
        this.products.add(product);
    }
}
