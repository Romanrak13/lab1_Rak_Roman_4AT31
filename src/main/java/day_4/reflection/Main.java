package day_4.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        MyAnyCustomClass myClass = new MyAnyCustomClass("some", 1234);

        System.out.println(get(myClass, "field"));
        System.out.println(set(myClass, "field", "other"));
        System.out.println(clear(myClass, "field"));
    }

    private static Object clear(Object object, String fieldName) {
        Class thisClass = object.getClass();
        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(object, "");
            return f.get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object set(Object object, String fieldName, String text) {
        Class thisClass = object.getClass();
        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.set(object, text);
            return f.get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object get(Object object, String fieldName) {
        Class thisClass = object.getClass();
        try {
            Field f = thisClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}