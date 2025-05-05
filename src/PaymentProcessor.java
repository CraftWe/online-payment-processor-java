public interface PaymentProcessor {

    boolean processPayment(double amount) throws PaymentException;

    boolean isSuccessful();
}