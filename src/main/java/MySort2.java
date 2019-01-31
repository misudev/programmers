import java.util.Arrays;
import java.util.Comparator;

public class MySort2 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(n)==o2.charAt(n)){
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n) ;
            }
        });
        return strings;
    }

    public static void main(String[] args){
        String[] arr = new String[]{"sun", "bed", "car"};
        String[] answer = solution(arr, 1);
        for(String s : answer)
            System.out.println(s);
        System.out.println();
    }
}
