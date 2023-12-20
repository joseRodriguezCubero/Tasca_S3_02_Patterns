package n3exercici1;

import java.util.ArrayList;

public class ConverterEuros extends Converter{

    public static final float CONVERSIONFACTOR = 0.91f;
    @Override
    public void convert(ArrayList<Product> products) {
        for (Product p : products) {
            p.setPrice(p.getPrice()*CONVERSIONFACTOR);
            System.out.println(p);
        }
    }
}
