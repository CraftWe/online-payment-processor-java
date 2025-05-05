# Online Payment Processor

This Java project implements a simplified online payment processing system with support for different payment methods.

## Project Description

The project consists of several Java classes that work together to simulate processing online payments. It includes an interface (`PaymentProcessor`), an abstract class (`OnlinePaymentProcessor`), a custom exception (`PaymentException`), and concrete classes for handling credit card (`CreditCardProcessor`) and PayPal (`PayPalProcessor`) payments.  The `Main` class demonstrates how to use these classes to process payments.

## Project Structure

The project contains the following files:

* `PaymentProcessor.java`: An interface defining the contract for any payment processor.
* `OnlinePaymentProcessor.java`: An abstract class providing a base implementation for online payment processors.
* `CreditCardProcessor.java`: A class that extends `OnlinePaymentProcessor` to handle credit card payments.
* `PayPalProcessor.java`: A class that extends `OnlinePaymentProcessor` to handle PayPal payments.
* `PaymentException.java`: A custom exception class used to handle payment-related errors.
* `Main.java`: A class that demonstrates how to use the payment processors.

## Features

* Defines a `PaymentProcessor` interface with methods for processing payments and checking the status.
* Provides an abstract `OnlinePaymentProcessor` class with common functionality for online payment processing.
* Implements `CreditCardProcessor` to simulate credit card payments, including validation and error handling.
* Implements `PayPalProcessor` to simulate PayPal payments, including validation and error handling.
* Uses a custom `PaymentException` to handle payment-related errors.
* Demonstrates payment processing with different payment methods in the `Main` class.

## How to Use

1.  **Compile the Java code:**

    ```bash
    javac \*.java
    ```

2.  **Run the `Main` class:**

    ```bash
    java Main
    ```

    The `Main` class will simulate processing payments using both `CreditCardProcessor` and `PayPalProcessor` and display the results.
