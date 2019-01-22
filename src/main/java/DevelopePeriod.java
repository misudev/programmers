import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DevelopePeriod {
    public static int[] solution(int[] progresses, int[] speeds){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < speeds.length; i++){
            queue.add((int)Math.ceil((100 - progresses[i])/speeds[i]));
        }
        for(int i : queue){
            System.out.println("q : "+i);
        }
        while(!queue.isEmpty()){
            int count = 1;
            int poll = queue.poll();
            while(!queue.isEmpty() && poll >= queue.peek()){
                queue.poll();
                count ++;
            }
            arrayList.add(count);
        }

        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return  answer;
    }
    public static void main(String[] args){
        int[] a = solution(new int[]{93,30,55}, new int[]{1, 30 ,5});
        for(int i : a){
            System.out.println(i);
        }

        int[] b = solution(new int[]{20,1,1}, new int[]{1, 1 ,1});
        for(int i : b){
            System.out.println(i);
        }
    }
}
