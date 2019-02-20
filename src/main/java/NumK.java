import java.util.Arrays;
import java.util.LinkedList;

public class NumK {
    public static  int[] solution(int[] array, int[][] commands){
        int row = commands.length;
        int[] answer = new int[row];

        for(int i = 0; i < row; i++){
               int[] subArr  = Arrays.copyOfRange(array,commands[i][0] - 1, commands[i][1]);
               Arrays.sort(subArr);
               answer[i] = subArr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args){
        int[] arr = solution(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2,5,3},{4,4,1}});

        for(int i : arr)
            System.out.println(i);


    }

}
