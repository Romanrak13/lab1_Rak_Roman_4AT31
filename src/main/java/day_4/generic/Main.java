package day_4.generic;

import day_4.reflection.MyAnyCustomClass;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Make two different comparators for your Custom class
        // (simple java class with few fields).
        // End users should be able to use ‘min’, ‘max’, ‘sotr’ methods
        // with that comparators.

        List<MyAnyCustomClass> list = new ArrayList<>(Arrays.asList(
                new MyAnyCustomClass("some1", 123),
                new MyAnyCustomClass("etg", 28),
                new MyAnyCustomClass("fgjm", 321),
                new MyAnyCustomClass("fhu76", 2)
        ));
        System.out.println(list);
        System.out.println(max(list, new Comparator2()));
        System.out.println(min(list, new Comparator2()));
        sort(list, new Comparator2());
        System.out.println(list);
    }

    private static void sort(List<MyAnyCustomClass> list, Comparator2 personComparatorByField2) {
        Collections.sort(list, personComparatorByField2);
    }

    private static MyAnyCustomClass min(List<MyAnyCustomClass> list, Comparator2 personComparatorByField2) {
        return Collections.min(list, personComparatorByField2);
    }

    private static MyAnyCustomClass max(List<MyAnyCustomClass> list, Comparator personComparatorByField2) {
        return Collections.max(list, personComparatorByField2);
    }
}