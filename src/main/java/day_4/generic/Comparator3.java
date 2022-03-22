package day_4.generic;
import day_4.reflection.MyAnyCustomClass;
import java.util.Comparator;

public class Comparator3 implements Comparator<MyAnyCustomClass> {
    public int compare(MyAnyCustomClass o1, MyAnyCustomClass o2) {
        return o1.getField3().compareTo(o2.getField3());
    }
}