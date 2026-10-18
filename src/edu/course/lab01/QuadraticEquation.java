package edu.course.lab01;

public class QuadraticEquation {

    public static void solve(double a, double b, double c) {

        if (a == 0) {
            System.out.println("Ошибка: a не должно быть равно 0");
            return;
        }

        double d = b * b - 4 * a * c;

        if (d > 0) {

            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);

        } else if (d == 0) {

            double x = -b / (2 * a);
            System.out.println(x);

        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}