package day_2;

public class Calculator {

    public static void main(String[] args){


        double a=2.666;
        double b=10;

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mult(a,b));
        System.out.println(divide(a,b));
    }

    private static double divide(double a, double b) {
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
