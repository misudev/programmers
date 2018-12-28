import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortMyWay {
    public static void main(String[] args){

    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings);

        Map<Integer, Character> hm = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            hm.put(i,strings[i].charAt(n));
        }


        return answer;
    }
}
