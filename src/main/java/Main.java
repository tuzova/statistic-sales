import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int sum = service.sumSales(sales);
        System.out.println(sum);

        int averageSum = service.averageSales(sales);
        System.out.println(averageSum);

        int maxMonth = service.maxSales(sales);
        System.out.println(maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println(minMonth);

        int countMin = service.countMinSales(sales);
        System.out.println(countMin);

        int countMax = service.countMinSales(sales);
        System.out.println(countMax);

    }
}