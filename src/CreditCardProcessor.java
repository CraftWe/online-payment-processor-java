public class CreditCardProcessor extends OnlinePaymentProcessor {
	

    private String cardNumber;
    private String cvv;

    public CreditCardProcessor(String transactionId, String cardNumber, String cvv) {
        super(transactionId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) throws PaymentException {
        // Simulate credit card processing logic (replace with actual integration)
        System.out.println("Simulating credit card payment processing...");
        boolean success = Math.random() > 0.1; // Simulate random failure
        if (!success) {
            throw new PaymentException("Credit card payment failed.");
        }
        return success;
    }

    @Override
    public boolean isSuccessful() {
        // Override to check for successful processing based on implementation
        return super.isSuccessful(); // Can be modified based on specific logic
    }
}