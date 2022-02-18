package day_2;

public class Calculator {
    public static void main(String[] args) {
        double a = 2.66;
        double b = 10;

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divade(a,b));
    }

    public static double divade(double a, double b) {
        return a/b;
    }

    private static double mult(double a, double b) {
        return a*b;
    }

    private static double minus(double a, double b) {
        return a-b;
    }

    private static double add(double a, double b) {
        return a+b;
    }
}
