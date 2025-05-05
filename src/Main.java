public class Main {

    public static void main(String[] args) {
        double amount = 100.00;

        try {
            // Use CreditCardProcessor
            OnlinePaymentProcessor processor = new CreditCardProcessor("TX1234", "1234567890123456", "123");
            boolean success = processor.processPayment(amount);
            if (success) {
                System.out.println("Payment using Credit Card was successful. Transaction ID: " + processor.getTransactionId());
            } else {
                System.out.println("Payment using Credit Card failed.");
            }

            // Use PayPalProcessor
            processor = new PayPalProcessor("EX1234", "user@example.com");
            success = processor.processPayment(amount);
            if (success) {
                System.out.println("Payment using PayPal was successful. Transaction ID: " + processor.getTransactionId());
            } else {
                System.out.println("Payment using PayPal failed.");
            }
        } catch (PaymentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
