package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 180;

        int sum = service.sumSales(sales);
        assertEquals(expected, sum);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int sum = 180;
        long expected = 15;

        int averageSum = service.averageSales(sales);
        assertEquals(expected, averageSum);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 8;

        int maxMonth = service.maxSales(sales);
        assertEquals(expected, maxMonth);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long expected = 9;

        int minMonth = service.minSales(sales);
        assertEquals(expected, minMonth);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateCountMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int averageSum = 15;
        long expected = 5;

        int countMin = service.countMinSales(sales);
        assertEquals(expected, countMin);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateCountMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int averageSum = 15;
        long expected = 5;

        int countMax = service.countMinSales(sales);
        assertEquals(expected, countMax);
    }
}