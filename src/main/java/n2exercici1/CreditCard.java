package n2exercici1;

public class CreditCard extends PaymentPlatform{
    @Override
    public void execute() {
        System.out.println("pago aceptado con tarjeta de crédito.");
    }
}
