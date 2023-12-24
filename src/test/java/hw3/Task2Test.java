package hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    @DisplayName("Проверяет числа, которые попадают в интервал")
    void testNumberInInterval() {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(30));
        assertTrue(task2.numberInInterval(50));
        assertTrue(task2.numberInInterval(99));
    }

    @Test
    @DisplayName("Проверяет числа, которые не попадают в интервал")
    void testNumberNotInInterval() {
        Task2 task2 = new Task2();
        assertFalse(task2.numberInInterval(10));
        assertFalse(task2.numberInInterval(25));
        assertFalse(task2.numberInInterval(100));
    }
}