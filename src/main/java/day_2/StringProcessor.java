package day_2;

public class StringProcessor {
    public static void main(String[] args) {
        String s = "Task 2. Given a string, find the number of words in it.";
        System.out.println(s.split(" ").length);

        //Task 3. Given a string, show number of chars in each word
        for(String w: s.split(" ")){
            System.out.println(w.length()+"\t"+w);
        }

        //Task 4. Create function which takes 2 parameters
        System.out.println(stringWordCalc(s, 4));

    }

    private static int stringWordCalc(String s, int i){
        return s.split(" ")[i].length();
    }
}