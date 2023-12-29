package hw6;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class AverageCalculationTest {

    @Test
    public void testCompareAverage_FirstListGreater() {
        List<Integer> list1 = Arrays.asList(5, 10, 15);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverage__SecondListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(10, 20, 30);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverage_EqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverage_EmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverage_FirstListEmpty() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverage_SecondListEmpty() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList();

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverage_TwoEqualValues() {
        List<Integer> list1 = Arrays.asList(5, 10);
        List<Integer> list2 = Arrays.asList(5, 10);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverage_NegativeValues() {
        List<Integer> list1 = Arrays.asList(-5, -2);
        List<Integer> list2 = Arrays.asList(-10, -15);

        String result = AverageCalculation.compareAverage(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }
}
