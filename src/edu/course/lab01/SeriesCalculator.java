package edu.course.lab01;

public class SeriesCalculator {

    public static void calculate() {

        double sum = 0;
        int count = 0;
        int lastN = 0;

        int n = 2;

        while (true) {

            double term = 1.0 / (n * n + n - 2);

            if (Math.abs(term) < 1e-6) {
                break;
            }

            sum += term;
            count++;
            lastN = n;

            n++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Последний n: " + lastN);
        System.out.println("Количество членов: " + count);
    }
}