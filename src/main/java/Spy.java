import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Spy {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
           if(hm.containsKey(clothes[i][1])){
               int v = hm.get(clothes[i][1]);
               hm.put(clothes[i][1], ++v);
           }else{
               hm.put(clothes[i][1], 1);
           }
        }
        Iterator<String> iterator = hm.keySet().iterator();
        while(iterator.hasNext()){
            answer = (hm.get(iterator.next()) + 1) * answer;
        }
        return answer - 1;
    }

    public static void main(String[] args){
        //[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]
        String[][] c = new String[3][2];
        c[0][0] = "yellow_hat";
        c[0][1] = "headgear";
        c[1][0] = "yellow_hat";
        c[1][1] = "eyewear";
        c[2][0] = "yellow_hat";
        c[2][1] = "headgear";

        System.out.println(solution(c));
    }
}
