package ru.netology.javaGroup.JavaQa;

public class StatService {
    //Сумма всех продаж.
    public long theSumOfAllSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    //Средняя сумма продаж в месяц.
    public long averageAmountOfSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / sales.length;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    public int maxAmount(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.
    public int minAmount(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];// переменная для индекса рассматриваемого месяца в массиве
        for (int i = 0; i < sales.length; i++) {// следующий рассматриваемый месяц имеет номер на 1 больше
            if (sales[i] >= minSale) {// sales[minMonth] - продажи в месяце minMonth
                minSale = sales[i];// sale - продажи в рассматриваемом месяце
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего.
    public int lowAverage(long[] sales) {
        long averageSale = averageAmountOfSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale <= averageSale) {
                counter++;
            }
        }
        return counter;
    }

    //Количество месяцев, в которых продажи были выше среднего.
    public int aboveAverage(long[] sales) {
        long averageSale = averageAmountOfSales(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}