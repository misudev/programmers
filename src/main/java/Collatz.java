public class Collatz {
    public int solution(int num) {
        int answer = 0;
        long long_num = num;

        while(answer <= 500){
            if(long_num == 1){
                return answer;
            }else if(long_num % 2 == 0){
                long_num  = long_num / 2;
                answer ++;
            }else{
                long_num = long_num * 3;
                long_num ++;
                answer ++;
            }
        }
        return -1;
        
    }
}
