
public class PayPalProcessor extends OnlinePaymentProcessor {

    private String email;

    public PayPalProcessor(String transactionId, String email) {
        super(transactionId);
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) throws PaymentException {
        // Simulate PayPal processing logic (replace with actual integration)
        System.out.println("Simulating PayPal payment processing...");
        boolean success = Math.random() > 0.2; // Simulate random failure
        if (!success) {
            throw new PaymentException("PayPal payment failed.");
        }
        return success;
    }

    @Override
    public boolean isSuccessful() {
        // Override to check for successful processing based on implementation
        return super.isSuccessful(); // Can be modified based on specific logic
    }
}