package ru.netology.stats;

public class StatsService {

    // 1. Рассчет суммы всех продаж
    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales)
            sum += sale;
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public int averageSales(long[] sales, int sum) {
        int averageSum = sum / 12;
        return averageSum;
    }

    // 3. Расчет номера месяца максимальных продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

     // 4. Расчет номера месяца минимальных продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    public int countMinSales(long[] sales, int averageSum) {
        int countMin = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                countMin++;
            }
        }
        return countMin;
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    public int countMaxSales(long[] sales, int averageSum) {
        int countMax = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                countMax++;
            }
        }
        return countMax;
    }
}