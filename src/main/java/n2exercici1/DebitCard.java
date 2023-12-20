package n2exercici1;

import java.util.logging.Logger;

public class DebitCard extends PaymentPlatform{

    @Override
    public void execute() {
        System.out.println("pago aceptado con tarjeta de débito.");
    }
}
