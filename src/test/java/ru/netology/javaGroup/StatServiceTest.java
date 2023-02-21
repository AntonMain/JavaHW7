package ru.netology.javaGroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaGroup.JavaQa.StatService;

public class StatServiceTest {
    @Test
    public void theSumOfAllSalesTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.theSumOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountOfSalesTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.averageAmountOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAmountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAmountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.minAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowAverageTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.lowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}