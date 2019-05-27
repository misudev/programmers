import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max = citations[citations.length-1];

        for(int i = max; i > 0 ; i--){
            int overCount = 0;
            for(int j = citations.length  ; j > 0; j--){
                if(citations[j - 1] >= i){
                    overCount++;
                }
            }
            if(overCount >= i){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
