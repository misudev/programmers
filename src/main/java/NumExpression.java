public class NumExpression {
    public int solution(int n) {
        int answer = 0;
        int end = 2;

        for(int i = 2; i < n/2; i++){
            if(i%2 == 0){
                if ((n/i -(i/2 -1)) <= 0) break;
                answer += (n%i == i/2)? 1 : 0;
            }else{
                if (n/i -(i/2 ) <= 0) break;
                answer += (n%i == 0)? 1 : 0;
            }
        }
        return answer + 1;
    }
}
