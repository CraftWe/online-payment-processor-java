
public abstract class OnlinePaymentProcessor implements PaymentProcessor {

    private String transactionId;

    public OnlinePaymentProcessor(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public abstract boolean processPayment(double amount) throws PaymentException;

    @Override
    public boolean isSuccessful() {
        // Default implementation can be overridden by subclasses
        return false;
    }

    public String getTransactionId() {
        return transactionId;
    }
}