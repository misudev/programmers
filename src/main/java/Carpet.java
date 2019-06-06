public class Carpet {
    public static void main(String[] args){
        int[] answer = solution(10,2);
        for(int i : answer)
            System.out.println(i);
    }

    public static int[] solution(int brown, int red){
        int total = brown + red;
        int w = 0;
        int h = 0;
        for(int i = 3; i <= total/3; i++){
            if(total % i == 0){
                if(red ==(i - 2)*((total/i) - 2)){
                    h = i;
                    w = total / i;
                    break;
                }
            }
        }
        return new int[]{w,h};
    }
}
