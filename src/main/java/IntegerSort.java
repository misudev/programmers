import java.util.Arrays;
import java.util.Comparator;

public class IntegerSort {
    public long solution(long n) {
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr, new Comparator<Character>(){
            @Override
            public int compare(char c1, char c2) {
                return 0;
            }
        });
        return Long.parseLong(new String(arr));
    }
    public static void main(String[] args){

    }
}