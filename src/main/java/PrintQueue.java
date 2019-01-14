import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        int index = 0;

        for(int i : priorities){
            queue.add(i);
            queue2.add(index++);
        }

        Arrays.sort(priorities);

        int tmp = -1;
        int tmp1 = -1;
        int tmp2 = -1;
        index = priorities.length -1;

        while(!queue.isEmpty()){
            if(tmp == location){
                break;
            }
            if(queue.peek()==priorities[index]){
                answer++;
                queue.poll();
                tmp = queue2.poll();
                index --;
            }else{
                tmp1 = queue.poll();
                tmp2 = queue2.poll();

                queue.add(tmp1);
                queue2.add(tmp2);
            }

        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println("sol : "+solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }
}
