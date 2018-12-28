import java.util.Arrays;
class MinNum {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int min = arr[0];
        int index = 0;

        if(length == 1){
            return new int[]{-1};
        }
        int[] answer = new int[length - 1];
        for(int i = 1; i < length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        int index2 = 0;
        for(int i = 0; i < length-1 ;i++){
            if(i == index){
                answer[i] = arr[++index2];
            }else{
                answer[i] = arr[index2];
            }
            index2 ++;
        }
        return answer;
    }
}