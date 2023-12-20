package n3exercici1;

import java.util.ArrayList;

public class ConverterDollars extends Converter{

    public static final float CONVERSIONFACTOR = 1.10f;
    @Override
    public void convert(ArrayList<Product> products) {
        for (Product p : products) {
            p.setPrice(p.getPrice()*CONVERSIONFACTOR);
            System.out.println(p);
        }

    }
}
