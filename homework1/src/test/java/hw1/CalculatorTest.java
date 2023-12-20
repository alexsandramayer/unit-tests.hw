package hw1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("After all tests");
    }


    @Test
    @DisplayName("Тест с допустимыми аргументами")
    void testValidArguments() {
        double actualDiscountedAmount = calculator.calculateDiscount(100, 20);
        assertEquals(80, actualDiscountedAmount, "Цена после вычета скидки должна составлять 80");
    }

    @Test
    @DisplayName("Тест с суммой покупки равной нулю")
    void testPurchaseAmountEqualToZero() {
        double actualDiscountedAmount = calculator.calculateDiscount(0, 10);
        assertEquals(0, actualDiscountedAmount, "Цена должна составлять 0");
    }

    @Test
    @DisplayName("Тест с отрицательным процентом скидки")
    void testNegativeDiscountPercentage() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(200, -50),
                "Invalid discount percentage, выбрасывается ArithmeticException");
    }

    @Test
    @DisplayName("Тест с нулевым процентом скидки")
    void testZeroPercentDiscount() {
        double actualDiscountedAmount = calculator.calculateDiscount(150, 0);
        assertEquals(150, actualDiscountedAmount, "Цена должна составлять 150");
    }

    @Test
    @DisplayName("Тест с отрицательным процентом скидки")
    void testNegativePurchaseAmount() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-100, 30),
                "Invalid purchase amount, выбрасывается ArithmeticException");
    }

}