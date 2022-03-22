package day_4.generic;

import day_4.reflection.MyAnyCustomClass;
import java.util.Comparator;

public class Comparator2 implements Comparator<MyAnyCustomClass> {
    public int compare(MyAnyCustomClass o1, MyAnyCustomClass o2) {
        return o1.getField2().compareTo(o2.getField2());
    }
}