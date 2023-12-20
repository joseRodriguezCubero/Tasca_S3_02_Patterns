package n2exercici1;

import java.util.Optional;

public abstract class PaymentPlatform {
    final void executeWith(Callback callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void execute();
}

