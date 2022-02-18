package day_3;

import java.util.*;

public class collectionPerformance {

    public static void main(String[] args) {
        //4) Check performance for some List operations (get(i), insertAfter(i), ..)
        // for different collection implementations.
        List<String> arrayList = new ArrayList<>(Arrays.asList(("is simply dummy " +
                "text of the printing and typesetting industry. Lorem Ipsum has " +
                "been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it" +
                " to make a type specimen book. It has survived not only five " +
                "centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the " +
                "1960s with the release of Letraset sheets containing Lorem " +
                "Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.\").split(\" \")));\n" +
                "       ").split(" ")));
        List<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Insert performance:");
        System.out.println("arrayList:" + checkInsert(arrayList));
        System.out.println("linkedList:" + checkInsert(linkedList));

        arrayList = generateAdditional(arrayList);
        linkedList = generateAdditional(linkedList);

        //System.out.println(arrayList);
        //System.out.println(linkedList);

        System.out.println("Get performance:");
        System.out.println("arrayList:" + checkInpute(arrayList));
        System.out.println("linkedList:" + checkInpute(linkedList));

        //System.out.println(checkInsert(arrayList));
    }

    private static long checkInsert(List<String> list) {
        long start = new Date().getTime();
        int size = list.size();

        for(int i = 0; i < 1000; i++) {
            int randIndex = new Random().nextInt(size);
            list.set(randIndex, "WAAAGH");
        }

        return new Date().getTime() - start;
    }

    private static List<String> generateAdditional(List<String> list) {
        for(int i = 0; i < 10; i++){
            list.addAll(list);
        }
        return list;
    }

    private static long checkInpute(List<String> arrayList) {
        long start = new Date().getTime();
        int size = arrayList.size();

        for(int i = 0; i < 1000; i++) {
            int randIndex = new Random().nextInt(size);
            int wSize = arrayList.get(randIndex).length();
        }

        return new Date().getTime() - start;
    }
}