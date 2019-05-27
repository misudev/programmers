import java.util.Arrays;

public class Greedy1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -2;
                    reserve[j] = -2;
                    answer ++;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i ++){
            int index = lost[i];
            if(index == -2) continue;
            for(int j = 0; j < reserve.length ; j++){
                int reserveIndex = reserve[j];
                if(reserveIndex == -2) continue;
                if(index - 1 == reserveIndex){
                    reserve[j] = -2;
                    answer ++;
                    break;
                }else if( index + 1 == reserveIndex ){
                    reserve[j] = -2;
                    answer ++;
                    break;
                }
            }
        }
        return answer;
    }
}
