package hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    @DisplayName("Проверка, является ли число четным")
    void testEvenNumber() {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(2));
        assertTrue(task1.evenOddNumber(4));
        assertTrue(task1.evenOddNumber(100));
    }

    @Test
    @DisplayName("Проверка, является ли число нечетным")
    void testOddNumber() {
        Task1 task1 = new Task1();
        assertFalse(task1.evenOddNumber(1));
        assertFalse(task1.evenOddNumber(3));
        assertFalse(task1.evenOddNumber(99));
    }

    @Test
    public void testZero() {
        Task1 task1 = new Task1();
        assertTrue(task1.evenOddNumber(0));
    }
}