package day_3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        double[] array = {5, 9, 3, 2, 0, -4, -8.1, 3 ,-4};
        double max=array[0];
        for (double e:array){
            if(e>max){
                max=e;
            }
            System.out.println("max = " +max);
        }
        int[] array_2 = {5, 9, 3, 3, 0, 2, 3 ,1};
        int[] result_2 = new int[array_2.length];
        for (int e:array_2) {
            if (!contains(array_2,e)) {
              result_2[i++]=e;
            }
        }
    }
}
