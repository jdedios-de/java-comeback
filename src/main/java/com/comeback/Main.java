package com.comeback;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DeveloperFormatter formatter =
                developer -> developer.name() + " (" + developer.experience() + " years)";

        var developer = new Developer("Alex", 8);

        System.out.println(formatter.format(developer));

    }

    static String describe(Payment payment) {

        return switch (payment) {
            case CreditCardPayment card when card.cardNumber().startsWith("4")
                    -> "Visa card";

            case CreditCardPayment card
                    -> "Other credit card";

            case PayPalPayment paypal
                    -> "PayPal";
        };
    }
}