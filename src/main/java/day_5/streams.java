package day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


        import day_4.generic.Comparator2;
        import day_4.reflection.MyAnyCustomClass;



public class streams {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(args));
        List<MyAnyCustomClass> list = new ArrayList<>(Arrays.asList(
                new MyAnyCustomClass("some1", 123),
                new MyAnyCustomClass("etg", 28),
                new MyAnyCustomClass("fgjm", 321),
                new MyAnyCustomClass("fhu76", 2)
        ));

        System.out.println(list);
        List<String> sortedList = list.stream().sorted(new Comparator2()).map(MyAnyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> list1 = list.stream().sorted(new Comparator<MyAnyCustomClass>() {
            @Override
            public int compare(MyAnyCustomClass o1, MyAnyCustomClass o2) {
                return o1.getField1().compareTo(o2.getField1());
            }
        }).map(MyAnyCustomClass::getField1).collect(Collectors.toList());
        System.out.println(list1);
    }
}