package hw1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int calculateDiscount(int purchaseAmount, int discountPercentage) {
        if (purchaseAmount < 0) {
            throw new ArithmeticException("Invalid purchase amount");
        }
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid discount percentage");
        }
        double discount = purchaseAmount * discountPercentage / 100.0;
        return purchaseAmount - (int)discount;
    }
}

