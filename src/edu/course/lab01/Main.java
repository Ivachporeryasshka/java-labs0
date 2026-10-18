package edu.course.lab01;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            printHelp();
            return;
        }

        try {
            switch (args[0].toLowerCase()) {

                case "fizzbuzz":
                    if (args.length != 1) {
                        printHelp();
                        return;
                    }
                    FizzBuzz.run();
                    break;

                case "reverse":
                    if (args.length != 2) {
                        printHelp();
                        return;
                    }
                    System.out.println(TextTasks.reverse(args[1]));
                    break;

                case "quadratic":
                    if (args.length != 4) {
                        printHelp();
                        return;
                    }

                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double c = Double.parseDouble(args[3]);

                    QuadraticEquation.solve(a, b, c);
                    break;

                case "series":
                    if (args.length != 1) {
                        printHelp();
                        return;
                    }
                    SeriesCalculator.calculate();
                    break;

                case "palindrome":
                    if (args.length != 2) {
                        printHelp();
                        return;
                    }
                    System.out.println(TextTasks.isPalindrome(args[1]));
                    break;

                default:
                    printHelp();
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных.");
        }
    }

    private static void printHelp() {
        System.out.println("Использование:");
        System.out.println("fizzbuzz");
        System.out.println("reverse <строка>");
        System.out.println("quadratic <a> <b> <c>");
        System.out.println("series");
        System.out.println("palindrome <строка>");
    }
}