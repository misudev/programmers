import java.util.Stack;

public class Tower {
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        int now = 0;
        for(int i = heights.length -1 ; i > 0; i--){
            now = heights[i];
            for(int z = i -1; z >= 0 ; z--) {
                if (now < heights[z]) {
                    answer[i] = z + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        for(int i : solution(new int[]{6,9,5,7,4})){
            System.out.println(i);
        }
    }
}


