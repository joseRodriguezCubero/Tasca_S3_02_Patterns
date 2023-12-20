package n2exercici1;

public class Paypal extends PaymentPlatform{
    @Override
    public void execute() {
        System.out.println("pago aceptado con Paypal.");
    }
}
