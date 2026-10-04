package com.comeback;

public sealed interface Payment permits CreditCardPayment, PayPalPayment {
}
