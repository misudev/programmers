import java.util.*;
public class Cantfinish {


        public String solution(String[] participant, String[] completion){
            Map<String, Integer> hm = new HashMap<>();
            String answer = "" ;

            for(String s : participant){
                hm.put(s , hm.getOrDefault(s , 0)+1 );
            }

            for(String s :completion){
                hm.put(s,hm.get(s) -1);
            }

            for(String s : participant){
                if ( hm.get(s)!= 0 )
                    answer = s;
            }

            return answer;
        }

}
