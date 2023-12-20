package n3exercici1;

public class Item {
    ListItems serviceA;
    Converter serviceB;
    public Item(ListItems serviceA,Converter serviceB) {
        this.serviceA= serviceA;
        this.serviceB= serviceB;
    }
    public void showItems() {
        ;
        serviceB.convert(serviceA.getProducts());
    }
}
