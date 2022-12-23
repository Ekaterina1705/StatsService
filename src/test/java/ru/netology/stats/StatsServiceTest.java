package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void CalculateSumTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void averageSalesAmountTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSalesAmount(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;


        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSumMaxMonth() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.sumMaxMonth(maxMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSumMinMonth() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.sumMinMonth(minMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverage(sales);
        int expected = 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 0;

        long actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

}
